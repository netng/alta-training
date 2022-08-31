package com.alterra.training.springbootwebsocket.websockets.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    private String from;
    private String text;
}
