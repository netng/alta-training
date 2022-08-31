package com.alterra.training.springbootwebsocket.websockets.controllers;

import com.alterra.training.springbootwebsocket.websockets.dtos.MessageDTO;
import com.alterra.training.springbootwebsocket.websockets.dtos.OutputMessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessageDTO send(final MessageDTO messageDTO) throws Exception {
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessageDTO(messageDTO.getFrom(), messageDTO.getText(), time);
    }
}
