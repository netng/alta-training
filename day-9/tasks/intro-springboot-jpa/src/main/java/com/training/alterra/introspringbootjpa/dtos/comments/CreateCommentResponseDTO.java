package com.training.alterra.introspringbootjpa.dtos.comments;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CreateCommentResponseDTO implements Serializable {
    private Long id;
    private String content;

    @JsonIgnore
    private Date createdAt;

    @JsonIgnore
    private Date updatedAt;
}
