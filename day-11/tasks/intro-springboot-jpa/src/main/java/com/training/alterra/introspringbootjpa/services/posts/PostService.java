package com.training.alterra.introspringbootjpa.services.posts;

import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;
import com.training.alterra.introspringbootjpa.entities.Post;
import com.training.alterra.introspringbootjpa.exceptions.ResourceNotFoundException;
import com.training.alterra.introspringbootjpa.exceptions.ValidationErrorException;
import com.training.alterra.introspringbootjpa.repositories.CommentRepository;
import com.training.alterra.introspringbootjpa.repositories.PostRepository;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService implements IPostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    ModelMapper modelMapper;

    @SneakyThrows
    @Override
    public CreatePostResponseDTO createNewPost(CreatePostRequestDTO requestDTO) {
        validate(requestDTO);
        Post post = convertToEntity(requestDTO);

        Post createdPost = postRepository.save(post);

        return convertToDto(Optional.of(createdPost));
    }

    @Override
    public CreatePostResponseDTO getPostById(Long id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isEmpty()) {
            throw new ResourceNotFoundException("post not found!");
        }
        return convertToDto(post);
    }

    @Override
    public CreatePostResponseDTO updatePost(Long id, CreatePostRequestDTO requestDTO) {
        Optional<Post> post = postRepository.findById(id);
        post.get().setTitle(requestDTO.getTitle());
        post.get().setContent(requestDTO.getContent());
        Post updatedPost = postRepository.save(post.get());
        return convertToDto(Optional.of(updatedPost));
    }

    @Override
    public CreatePostResponseDTO deletePost(Long id) {
        postRepository.deleteById(id);
        return null;
    }

    @Override
    public List<CreatePostResponseDTO> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        if (!posts.isEmpty()) {
            return posts.stream()
                    .map(post -> modelMapper.map(post, CreatePostResponseDTO.class))
                    .collect(Collectors.toList());
        }

        return Collections.emptyList();
    }

    private void validate(CreatePostRequestDTO requestDTO) {
        if (requestDTO == null) {
            throw new ValidationErrorException("Body request cannot be empty");
        }

        if (StringUtils.isEmpty(requestDTO.getTitle())) {
            throw new ValidationErrorException("title cannot be blank");
        }

        if (StringUtils.isEmpty(requestDTO.getContent())) {
            throw new ValidationErrorException("content cannot be blank");
        }
    }

    private Post convertToEntity(CreatePostRequestDTO requestDTO) {
        return modelMapper.map(requestDTO, Post.class);
    }

    private CreatePostResponseDTO convertToDto(Optional<Post> post) {
        return modelMapper.map(post, CreatePostResponseDTO.class);
    }
}
