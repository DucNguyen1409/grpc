package com.nguyenduc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nguyenduc.dto.UserDetailDataDto;
import com.nguyenduc.dto.UserRequestDto;
import com.nguyenduc.dto.grpc.RequestDto;
import com.nguyenduc.dto.grpc.ResponseDto;

public interface UserService {
    ResponseDto<UserDetailDataDto> getUserByCardNo(final RequestDto<UserRequestDto> cardNo) throws JsonProcessingException;
}
