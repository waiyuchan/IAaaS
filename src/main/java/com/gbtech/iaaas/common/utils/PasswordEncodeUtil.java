package com.gbtech.iaaas.common.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodeUtil {

    public static void main(String[] args) {
        String rawPassword = "Admin@1234";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(rawPassword);
        System.out.println(encodePassword);
    }

}
