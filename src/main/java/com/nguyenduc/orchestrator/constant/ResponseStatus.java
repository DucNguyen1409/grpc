package com.nguyenduc.orchestrator.constant;

import java.util.Arrays;

public enum ResponseStatus {
    ENUM_NOT_FOUND("", "ResponseCode not found"),
    SUCCESS("0000", "Success"),
    ERROR("0600", "Error"),
    RS01("0100", "Refer to card issuer");


    private String code;
    private String detail;

    ResponseStatus(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public static ResponseStatus getEnum(String code) {
        return Arrays.stream(values())
                .filter(s -> s.getCode().equals(code))
                .findFirst()
                .orElseGet(() -> {
                    ResponseStatus status = ResponseStatus.ENUM_NOT_FOUND;
                    status.code = code;
                    return status;
                });
    }

    public String getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }
}
