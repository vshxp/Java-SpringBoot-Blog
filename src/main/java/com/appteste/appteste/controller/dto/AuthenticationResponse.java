package com.appteste.appteste.controller.dto;

public class AuthenticationResponse {
    private final String authenticationToken;
    private final String username;

    public AuthenticationResponse(String authenticationToken, String username) {
        this.authenticationToken = authenticationToken;
        this.username = username;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public String getUsername() {
        return username;
    }
}
