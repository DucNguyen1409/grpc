package com.nguyenduc.dto.grpc;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto<T> {
    private String lmid;
    private T data;
}
