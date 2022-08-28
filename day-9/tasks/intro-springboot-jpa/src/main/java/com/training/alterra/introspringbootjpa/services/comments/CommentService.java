package com.training.alterra.introspringbootjpa.services.comments;

import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.comments.CreateCommentResponseDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;
import com.training.alterra.introspringbootjpa.entities.Comment;
import com.training.alterra.introspringbootjpa.entities.Post;
import com.training.alterra.introspringbootjpa.repositories.CommentRepository;
import com.training.alterra.introspringbootjpa.repositories.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements ICommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<CreateCommentResponseDTO> getCommentsByPost(Long id) {
        Optional<Post> post = postRepository.findById(id);
        
    }

    @Override
    public CreateCommentResponseDTO createCommentByPost(Long id, CreateCommentRequestDTO requestDTO) {
        Optional<Comment> comment = postRepository.findById(id).map(post -> {
            requestDTO.setPost(post);
            return commentRepository.save(convertToEntity(requestDTO));
        });
        return convertToDto(comment);
    }

    private Comment convertToEntity(CreateCommentRequestDTO requestDTO) {
        return modelMapper.map(requestDTO, Comment.class);
    }

    private CreateCommentResponseDTO convertToDto(Optional<Comment> comment) {
        return modelMapper.map(comment, CreateCommentResponseDTO.class);
    }

}
