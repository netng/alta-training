package com.alterra.training.springbootwebsocket.websockets.clients;

import com.alterra.training.springbootwebsocket.websockets.configurations.StompSessionHandler;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;

import java.util.Scanner;

public class StompClient {
    private static final String URL = "ws://localhost:8080/chat";

    public static void main(String[] args) {
        WebSocketClient client = new StandardWebSocketClient();
        WebSocketStompClient stompClient = new WebSocketStompClient(client);

        stompClient.setMessageConverter(new MappingJackson2MessageConverter());

        StompSessionHandler sessionHandler = new StompSessionHandler();
        stompClient.connect(URL, sessionHandler);

        new Scanner(System.in).nextLine();
    }
}
