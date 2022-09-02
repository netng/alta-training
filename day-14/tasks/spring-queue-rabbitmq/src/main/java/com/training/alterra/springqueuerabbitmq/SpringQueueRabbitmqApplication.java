package com.training.alterra.springqueuerabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class SpringQueueRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringQueueRabbitmqApplication.class, args);
	}

}
