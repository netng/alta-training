package com.alterra.training.springbootwebsocket.websockets.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutputMessageDTO {
    private String from;
    private String text;
    private String time;

    public OutputMessageDTO(final String from, final String text, final String time) {

        this.from = from;
        this.text = text;
        this.time = time;
    }
}
