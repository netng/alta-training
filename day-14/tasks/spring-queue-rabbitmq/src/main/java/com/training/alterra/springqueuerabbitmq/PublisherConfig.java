package com.training.alterra.springqueuerabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherConfig {

    @Value("${queue.name}")
    private String message;

    @Bean
    public Queue queue() {
        return new Queue(message, true);
    }
}
