package dev.auth.authstudy.auth.dto;

import dev.auth.authstudy.auth.validator.ValidUsername;


public class SignupRequestDto {

    @ValidUsername
    private String username;
}
