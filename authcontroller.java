package com.smma.controller;

import com.smma.model.User;
import com.smma.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        boolean isValid = authService.login(
                user.getUsername(),
                user.getPassword()
        );

        if(isValid) {
            return "Login Successful";
        } else {
            return "Invalid Credentials";
        }
    }
}
