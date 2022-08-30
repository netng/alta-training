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
@RequestMapping("/v1")
public class PostsController {

    @Autowired
    IPostService postService;

    @GetMapping("/posts")
    public ResponseEntity<List<CreatePostResponseDTO>> index() {
        List<CreatePostResponseDTO> reponse = postService.getAllPosts();
        return new ResponseEntity<>(reponse, HttpStatus.OK);
    }

    @PostMapping("/posts")
    public ResponseEntity<CreatePostResponseDTO> create(@RequestBody CreatePostRequestDTO request) {
        CreatePostResponseDTO response = postService.createNewPost(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<CreatePostResponseDTO> show(@PathVariable("id") long id) {
        CreatePostResponseDTO response = postService.getPostById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @PutMapping("/posts/{id}")
    public ResponseEntity<CreatePostResponseDTO> update(@PathVariable("id") long id, @RequestBody CreatePostRequestDTO request) {
        CreatePostResponseDTO response = postService.updatePost(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @DeleteMapping("/posts/{id}")
    public ResponseEntity<HttpStatus> destroy(@PathVariable("id") long id) {
        postService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
