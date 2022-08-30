package com.training.alterra.introspringbootjpa.unittests;

import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostRequestDTO;
import com.training.alterra.introspringbootjpa.dtos.posts.CreatePostResponseDTO;
import com.training.alterra.introspringbootjpa.entities.Post;
import com.training.alterra.introspringbootjpa.exceptions.ValidationErrorException;
import com.training.alterra.introspringbootjpa.repositories.PostRepository;
import com.training.alterra.introspringbootjpa.services.posts.PostService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {
    @Mock
    PostRepository postRepository;

    ModelMapper modelMapper = spy(new ModelMapper());

    @InjectMocks
    PostService serviceUnderTest = spy(new PostService());

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * @Positive case
     */
    @Test
    public void givenValidRequest_whenCreateNewPost_thenShouldBeCreated() {
        CreatePostRequestDTO requestDTO = new CreatePostRequestDTO();
        requestDTO.setTitle("Belajar java bersama Alterra");
        requestDTO.setContent("Lorem ipusm dolor sit amet alterra cons");

        Post post = modelMapper.map(requestDTO, Post.class);
        post.setId(101L);

        when(postRepository.save(any(Post.class)))
                .thenReturn(post);

        CreatePostResponseDTO responseDTO = serviceUnderTest.createNewPost(requestDTO);
        assertThat(responseDTO.getId()).isNotNull();
        assertThat(responseDTO.getTitle()).isEqualTo(requestDTO.getTitle());
        assertThat(responseDTO.getContent()).isEqualTo(requestDTO.getContent());
    }

    @Test
    public void givenValidRequest_whenGetPostById_thenShouldBeReturnValidPost() {
        CreatePostRequestDTO requestDTO = new CreatePostRequestDTO();
        requestDTO.setTitle("Code Dream");
        requestDTO.setContent("When code make your wish and dream come true");

        Post post = modelMapper.map(requestDTO, Post.class);
        post.setId(100L);
        postRepository.save(post);

        when(postRepository.findById(post.getId())).thenReturn(Optional.of(post));

        CreatePostResponseDTO responseDTO = serviceUnderTest.getPostById(100L);
        assertThat(responseDTO.getId()).isEqualTo(100L);
        assertThat(responseDTO.getTitle()).isEqualTo(requestDTO.getTitle());
        assertThat(responseDTO.getContent()).isEqualTo(requestDTO.getContent());

    }

    /**
     * @Negative case
     */
    @Test(expected = ValidationErrorException.class)
    public void givenNullRequest_whenCreateNewPost_thenShouldThrowException() {
        serviceUnderTest.createNewPost(null);
    }
    
}
