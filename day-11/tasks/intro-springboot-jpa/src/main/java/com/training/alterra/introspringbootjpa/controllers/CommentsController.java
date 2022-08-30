package com.training.alterra.introspringbootjpa.controllers;

import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentResponseDTO;
import com.training.alterra.introspringbootjpa.entities.Comment;
import com.training.alterra.introspringbootjpa.services.comments.CommentService;
import com.training.alterra.introspringbootjpa.services.comments.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CommentsController {

    @Autowired
    ICommentService commentService;

    @PostMapping("/posts/{id}/comments")
    public ResponseEntity<CreateCommentResponseDTO> createCommentByPostId(
            @PathVariable(value = "id") Long id, @RequestBody CreateCommentRequestDTO request) {
        CreateCommentResponseDTO response = commentService.createCommentByPost(id, request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/posts/{id}/comments")
    public ResponseEntity<List<CreateCommentResponseDTO>> getCommentsByPost(@PathVariable(value = "id") Long id) {
        List<CreateCommentResponseDTO> response = commentService.getCommentsByPost(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CreateCommentResponseDTO> updateCommentByPost(
            @PathVariable(value = "postId") Long postId, @PathVariable(value = "commentId") Long commentId,
            @RequestBody CreateCommentRequestDTO request) {
        CreateCommentResponseDTO response = commentService.updateCommentByPost(postId, commentId, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<HttpStatus> deleteComment(
            @PathVariable(value = "postId") Long postId, @PathVariable(value = "commentId") Long commendId) {
        commentService.deleteComment(postId, commendId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
