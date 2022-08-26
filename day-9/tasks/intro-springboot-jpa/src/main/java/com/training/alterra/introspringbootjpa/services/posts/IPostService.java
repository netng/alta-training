package com.training.alterra.introspringbootjpa.services.posts;

import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;

import java.util.List;
import java.util.Optional;

public interface IPostService {
    List<CreatePostResponseDTO> getAllPosts();
    CreatePostResponseDTO createNewPost(CreatePostRequestDTO requestDTO);

    CreatePostResponseDTO getPostById(Long id);

    CreatePostResponseDTO updatePost(Long id, CreatePostRequestDTO requestDTO);

}
