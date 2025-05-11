package com.school.vaccine.service;

import com.school.vaccine.dto.LoginRequest;
import com.school.vaccine.dto.LoginResponse;
import com.school.vaccine.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtUtil jwtUtil;

    public LoginResponse login(LoginRequest request) {
        if ("admin".equals(request.getUsername()) && "admin".equals(request.getPassword())) {
            String token = jwtUtil.generateToken(request.getUsername());
            return new LoginResponse(token, "admin");
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
