package com.recruiter.auth_service.model.request;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}
