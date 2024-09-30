package com.nguyenduc.dto.grpc;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultDto {
    private String description;
    private String responseCode;
}
