package com.alterra.training.springbootwebsocket.websockets.configurations;

import com.alterra.training.springbootwebsocket.websockets.dtos.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;

import java.lang.reflect.Type;

public class StompSessionHandler extends StompSessionHandlerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(StompSessionHandler.class);

    @Override
    public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
        LOG.info("New session established: " + session.getSessionId());
        session.subscribe("/topic/messages", this);
        LOG.info("Subscribed to /topic/messages");

        session.send("/app/chat", getSampleMessage());

        LOG.info("Message sent to websocket server");
    }

    @Override
    public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload, Throwable exception) {
        LOG.error("Got an exception", exception);
    }

    @Override
    public Type getPayloadType(StompHeaders headers) {
        return MessageDTO.class;
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
        MessageDTO messageDTO = (MessageDTO) payload;
        LOG.info("Received : " + messageDTO.getText() + " from: " + messageDTO.getFrom());
    }

    private MessageDTO getSampleMessage() {
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setFrom("Nandang");
        messageDTO.setText("Hallo people!");
        return messageDTO;
    }
}
