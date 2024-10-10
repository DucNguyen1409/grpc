package com.nguyenduc.controller.grpc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.nguyenduc.constant.ResponseStatus;
import com.nguyenduc.dto.UserDetailDataDto;
import com.nguyenduc.dto.UserRequestDto;
import com.nguyenduc.dto.grpc.RequestDto;
import com.nguyenduc.dto.grpc.ResponseDto;
import com.nguyenduc.dto.grpc.ResultDto;
import com.nguyenduc.grpc.Result;
import com.nguyenduc.grpc.UserAtomicRequest;
import com.nguyenduc.grpc.UserAtomicResponse;
import com.nguyenduc.grpc.UserAtomicServiceGrpc;
import com.nguyenduc.service.UserService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class UserGrpcController extends UserAtomicServiceGrpc.UserAtomicServiceImplBase{

    private final UserService userService;
    private final Gson gson;

    @Override
    public void getUserByCardNo(UserAtomicRequest request,
                                StreamObserver<UserAtomicResponse> responseObserver) {
        ResponseStatus responseCode = ResponseStatus.SUCCESS;
        log.info("{}: getUsersByCardNo:grpc", request.getLmid());
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setCardNo(request.getData().getCardNo());

        RequestDto<UserRequestDto> dto = new RequestDto<>();
        dto.setLmid(request.getLmid());
        dto.setData(userRequestDto);

        // user service
        try {
            ResponseDto<UserDetailDataDto> responseDto = userService.getUserByCardNo(dto);
            log.info("{}: frUserService: {}", request.getLmid(), gson.toJson(responseDto));

            responseObserver.onNext(UserAtomicResponse.newBuilder()
                            .setResult(Result.newBuilder()
                                    .setResponseCode(responseCode.getCode())
                                    .setDescription(responseCode.getDetail())
                                    .build())
                            .build()); // TODO: set data response
        } catch (JsonProcessingException e) {
            responseCode = ResponseStatus.ERROR;
            log.error("{}: >>> {}", request.getLmid(), e.getMessage());
        }

        responseObserver.onCompleted();
    }

}
