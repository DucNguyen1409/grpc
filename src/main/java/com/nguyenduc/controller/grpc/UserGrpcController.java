package com.nguyenduc.controller.grpc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nguyenduc.constant.ResponseStatus;
import com.nguyenduc.dto.UserDetailDataDto;
import com.nguyenduc.dto.grpc.RequestDto;
import com.nguyenduc.dto.UserRequestDto;
import com.nguyenduc.dto.grpc.ResponseDto;
import com.nguyenduc.grpc.UserAtomicServiceGrpc;
import com.nguyenduc.grpc.UserAtomicServiceOuterClass;
import com.nguyenduc.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class UserGrpcController extends UserAtomicServiceGrpc.UserAtomicServiceImplBase {

    private final UserService userService;


    @Override
    public void getUserByCardNo(UserAtomicServiceOuterClass.UserAtomicRequest request) throws JsonProcessingException {
        ResponseStatus responseCode = ResponseStatus.SUCCESS;
        log.info("{}: getUsersByCardNo:grpc", request.getLmid());
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setCardNo(request.getData().getCardNo());

        RequestDto<UserRequestDto> dto = new RequestDto<>();
        dto.setLmid(request.getLmid());
        dto.setData(userRequestDto);

        // user service
        ResponseDto<UserDetailDataDto> responseDto = userService.getUserByCardNo(dto);
    }

}
