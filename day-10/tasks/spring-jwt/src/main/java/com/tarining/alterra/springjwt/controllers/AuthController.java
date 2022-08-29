package com.tarining.alterra.springjwt.controllers;

import com.tarining.alterra.springjwt.entities.AuthRequest;
import com.tarining.alterra.springjwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String welcome() {
        return "Hello";
    }

    @PostMapping("/auth/login")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authRequest.getPhone(), authRequest.getPassword()
                    )
            );
        } catch (Exception exception) {
            throw new Exception("invalid phone or password");
        }
        return jwtUtil.generateToken(authRequest.getPhone());
    }
}
