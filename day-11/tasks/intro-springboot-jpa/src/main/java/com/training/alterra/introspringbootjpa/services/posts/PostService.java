package com.training.alterra.introspringbootjpa.services.posts;

import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;
import com.training.alterra.introspringbootjpa.entities.Post;
import com.training.alterra.introspringbootjpa.repositories.CommentRepository;
import com.training.alterra.introspringbootjpa.repositories.PostRepository;
import lombok.SneakyThrows;
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
        Post post = convertToEntity(requestDTO);

        Post createdPost = postRepository.save(post);

        return convertToDto(Optional.of(createdPost));
    }

    @Override
    public CreatePostResponseDTO getPostById(Long id) {
        Optional<Post> post = postRepository.findById(id);
        return convertToDto(post);
    }

    @Override
    public CreatePostResponseDTO updatePost(Long id, CreatePostRequestDTO requestDTO) {
        Optional<Post> post = postRepository.findById(id);
        post.get().setContent(requestDTO.getContent());
        return convertToDto(Optional.of(postRepository.save(post.get())));
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

    private Post convertToEntity(CreatePostRequestDTO requestDTO) {
        return modelMapper.map(requestDTO, Post.class);
    }

    private CreatePostResponseDTO convertToDto(Optional<Post> post) {
        return modelMapper.map(post, CreatePostResponseDTO.class);
    }
}
