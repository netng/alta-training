package com.alterra.training.helloworldapp.v1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/messages")
public class MessagesController {

    @GetMapping
    public String index() {
        return "Hello, World";
    }

    @PostMapping
    public String create() {
        return "Hello, World";
    }

    @DeleteMapping("{id}")
    public String destroy(@PathVariable("id") Integer id) {
        return String.format("Hello, World -- ID: %s deleted", id);
    }
}
