package com.chrishsu.springbootchrismall.dto;

import javax.validation.constraints.NotBlank;

public class UserRegisterRequest {

    @NotBlank //不可為空值或空白字串
    private String email;

    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
