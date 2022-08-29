package com.training.alterra.introspringbootjpa.services.comments;

import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ICommentService {
    List<CreateCommentResponseDTO> getCommentsByPost(Long id);
    CreateCommentResponseDTO createCommentByPost(Long id, CreateCommentRequestDTO requestDTO);
    CreateCommentResponseDTO updateCommentByPost(Long postId, Long commentId, CreateCommentRequestDTO requestDTO);

    CreateCommentResponseDTO deleteComment(Long postId, Long commentId);
}
