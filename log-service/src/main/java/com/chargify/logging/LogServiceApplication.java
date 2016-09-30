package com.chargify.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogServiceApplication {

	public static final String NOTIFICATIONS = "notifications";
	public static final Integer MAX_MESSAGES = 50_000;

//	@Bean
//	public InitializingBean prepareQueues(AmqpAdmin amqpAdmin) {
//		return () -> {
//			Queue queue = new Queue(NOTIFICATIONS, true);
//			DirectExchange exchange = new DirectExchange(NOTIFICATIONS);
//			Binding binding = BindingBuilder.bind( queue ).to(exchange).with(NOTIFICATIONS);
//			amqpAdmin.declareQueue(queue);
//			amqpAdmin.declareExchange(exchange);
//			amqpAdmin.declareBinding(binding);
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(LogServiceApplication.class, args);
	}
}
