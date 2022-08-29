package com.tarining.alterra.springjwt.controllers;

import com.tarining.alterra.springjwt.entities.AuthRequest;
import com.tarining.alterra.springjwt.entities.User;
import com.tarining.alterra.springjwt.repositories.UserRepository;
import com.tarining.alterra.springjwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

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

    @GetMapping("/auth/info")
    public User getUserInfo() {
        String phone = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepository.findByPhone(phone);
    }
}
