package com.appteste.appteste.controller.dto;

public class Login {
    private String name;
    private String email;

    public Login(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
