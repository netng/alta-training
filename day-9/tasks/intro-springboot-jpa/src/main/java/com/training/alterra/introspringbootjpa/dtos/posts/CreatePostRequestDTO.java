package com.training.alterra.introspringbootjpa.dtos.posts;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CreatePostRequestDTO implements Serializable {

    private String title;
    private String content;
}
