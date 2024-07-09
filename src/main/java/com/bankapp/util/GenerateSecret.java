package com.bankapp.util;

import java.security.SecureRandom;
import java.util.Base64;

public class GenerateSecret {
    public static void main(String[] args) {
        byte[] secretKey = new byte[64];
        new SecureRandom().nextBytes(secretKey);
        String encodedKey = Base64.getEncoder().encodeToString(secretKey);
        System.out.println("Generated JWT Secret Key: " + encodedKey);
    }
}