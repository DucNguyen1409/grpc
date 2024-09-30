package com.nguyenduc.orchestrator.Utils;

import java.security.SecureRandom;

public class Common {

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
}
