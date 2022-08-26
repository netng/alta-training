package com.training.alterra.introspringbootjpa.services.posts;

import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;

import java.util.List;

public interface IPostService {
    CreatePostResponseDTO createNewPost(CreatePostRequestDTO requestDTO);

    List<CreatePostResponseDTO> getAllPosts();
}
