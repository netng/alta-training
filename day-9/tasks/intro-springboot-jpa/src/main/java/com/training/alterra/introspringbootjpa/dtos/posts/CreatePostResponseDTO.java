package com.training.alterra.introspringbootjpa.dtos.posts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CreatePostResponseDTO implements Serializable {
    private Long id;

    private String title;
    private String content;

    @JsonIgnore
    @JsonProperty(value = "created_at")
    private Date createdAt;

    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private Date updatedAt;
}
