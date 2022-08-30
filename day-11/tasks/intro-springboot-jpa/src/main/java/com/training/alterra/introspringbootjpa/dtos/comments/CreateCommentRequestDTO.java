package com.training.alterra.introspringbootjpa.dtos.comments;

import com.training.alterra.introspringbootjpa.entities.Post;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CreateCommentRequestDTO implements Serializable {
    private String content;
    private Post post;
}
