package com.training.alterra.introspringbootjpa.services.comments;

import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ICommentService {
    List<CreateCommentResponseDTO> getAllCommentsByPostId(Long id);

    CreateCommentResponseDTO createCommentByPostId(Long id, CreateCommentRequestDTO requestDTO);
}
