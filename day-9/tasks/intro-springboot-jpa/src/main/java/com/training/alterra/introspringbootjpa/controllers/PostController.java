package com.training.alterra.introspringbootjpa.controllers;

import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;
import com.training.alterra.introspringbootjpa.services.posts.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    IPostService postService;

    @GetMapping
    public ResponseEntity<List<CreatePostResponseDTO>> getAllPosts() {
        List<CreatePostResponseDTO> reponse = postService.getAllPosts();
        return new ResponseEntity<>(reponse, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CreatePostResponseDTO> createNewPost(@RequestBody CreatePostRequestDTO request) {
        CreatePostResponseDTO response = postService.createNewPost(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
