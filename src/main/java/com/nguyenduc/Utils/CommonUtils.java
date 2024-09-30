package com.nguyenduc.Utils;

import com.nguyenduc.dto.grpc.RequestDto;
import com.nguyenduc.grpc.MainServiceOuterClass;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class CommonUtils {

    private static final String VALID_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";

    public static String generateLMID() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = (int) (secureRandom.nextFloat() * (float) VALID_CHAR.length());
            result.append(VALID_CHAR.charAt(index));
        }

        return "AAAAAA".contentEquals(result) ? generateLMID() : result.toString();
    }

    public static MainServiceOuterClass.ServiceGrpcRequest buildGrpcRequest(RequestDto<?> dto, String jsonData) {
        return MainServiceOuterClass.ServiceGrpcRequest.newBuilder()
                .setLmid(dto.getLmid())
                .setJsonData(jsonData)
                .build();
    }

}
