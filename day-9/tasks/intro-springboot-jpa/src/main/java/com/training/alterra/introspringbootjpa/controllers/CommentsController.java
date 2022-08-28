package com.training.alterra.introspringbootjpa.controllers;

import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentResponseDTO;
import com.training.alterra.introspringbootjpa.services.comments.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentsController {

    @Autowired
    ICommentService commentService;

    @PostMapping("/posts/{id}/comments")
    public ResponseEntity<CreateCommentResponseDTO> createCommentByPostId(@PathVariable(value = "id") Long id, @RequestBody CreateCommentRequestDTO request) {
        CreateCommentResponseDTO response = commentService.createCommentByPost(id, request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/posts/{id}/comments")
    public ResponseEntity<List<CreateCommentResponseDTO>> getCommentsByPost(@PathVariable(value = "id") Long id) {
        List<CreateCommentResponseDTO> response = commentService.getCommentsByPost(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
