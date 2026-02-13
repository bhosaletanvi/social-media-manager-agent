package com.smma.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final String VALID_USERNAME = "admin";
    private final String VALID_PASSWORD = "1234";

    public boolean login(String username, String password) {
        return VALID_USERNAME.equals(username) &&
               VALID_PASSWORD.equals(password);
    }
}
