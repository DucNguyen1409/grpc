package com.nguyenduc.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDetailDataDto {
    private List<UserDetailInfoDto> detailInfoDtos;
}
