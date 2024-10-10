package com.nguyenduc.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nguyenduc.Utils.CommonUtils;
import com.nguyenduc.constant.ResponseStatus;
import com.nguyenduc.dto.UserDataDto;
import com.nguyenduc.dto.UserDetailDataDto;
import com.nguyenduc.dto.UserRequestDto;
import com.nguyenduc.dto.grpc.RequestDto;
import com.nguyenduc.dto.grpc.ResponseDto;
import com.nguyenduc.grpc.MainServiceGrpc;
import com.nguyenduc.grpc.ServiceGrpcResponse;
import com.nguyenduc.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private Long timeoutConfig = 60000L;
    private static final String DEADLINE_EXCEEDED = "DEADLINE_EXCEEDED";
    private final ObjectMapper mapper;

    @GrpcClient("management-service")
    MainServiceGrpc.MainServiceBlockingStub mainServiceBlockingStub;

    @Override
    public ResponseDto<UserDetailDataDto> getUserByCardNo(RequestDto<UserRequestDto> requestDto) throws JsonProcessingException {
        log.info("{}: getUserByCardNo", requestDto.getLmid());

        //validation check
        if (Objects.isNull(requestDto.getLmid())) {
            return ResponseDto.buildResponse(
                    requestDto,
                    null,
                    ResponseStatus.ERROR.getCode(),
                    ResponseStatus.ERROR.getDetail()
            );
        }

        log.info("{}: toUserService: getUserByCardNo > {}", requestDto.getLmid(), mapper.writeValueAsString(requestDto));
        var result = callToUserService(requestDto);
        UserDataDto data;
        if (ResponseStatus.SUCCESS.getCode().equals(result.getResponseCode())
                && StringUtils.hasText(result.getJsonData())) {
            data = mapper.readValue(result.getJsonData(), UserDataDto.class);
        } else {
            data = new UserDataDto();
        }
        log.info("{}: frUserService: getUserByCardNo {}", requestDto.getLmid(), result);

        return ResponseDto.buildResponse(
                requestDto,
                data.getDataDto(),
                result.getResponseCode(),
                result.getDescription()
        );
    }

    private ServiceGrpcResponse callToUserService(RequestDto<UserRequestDto> requestDto) throws JsonProcessingException {
        String jsonData = mapper.writeValueAsString(requestDto);
        var grpcRequest = CommonUtils.buildGrpcRequest(requestDto, jsonData);
        try {
            log.info("{}: toCardService callToUserService", requestDto.getLmid());
            return mainServiceBlockingStub
                    .withDeadlineAfter(timeoutConfig, TimeUnit.MILLISECONDS)
                    .getUserByCardNo(grpcRequest);
        } catch (Exception ex) {
            if (ex.getMessage().contains(DEADLINE_EXCEEDED)) {
                log.warn("{}: callToUserService message:: {}", requestDto.getLmid(), ex.getMessage());
            }
        }

        return ServiceGrpcResponse.newBuilder()
                .setResponseCode(ResponseStatus.ERROR.getCode())
                .setDescription(ResponseStatus.ERROR.getDetail())
                .build();
    }
}
