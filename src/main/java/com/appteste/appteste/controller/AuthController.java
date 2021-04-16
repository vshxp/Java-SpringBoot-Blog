package com.appteste.appteste.controller;

import com.appteste.appteste.controller.dto.AuthenticationResponse;
import com.appteste.appteste.controller.dto.LoginDto;
import com.appteste.appteste.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginDto loginDto) {
        return authService.login(loginDto);
    }
}
