package com.nguyenduc.dto.grpc;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class ResponseDto<T> {
    private String requestId;
    private ResultDto resultDto;
    private T data;

    public static <T> ResponseDto<T> buildResponse(RequestDto<?> req, T body, String responseCode, String description) {
        return new ResponseDto<T>()
                .requestId(req.getLmid())
                .resultDto(ResultDto.builder()
                        .description(description)
                        .responseCode(responseCode)
                        .build())
                .data(body);
    }
}
