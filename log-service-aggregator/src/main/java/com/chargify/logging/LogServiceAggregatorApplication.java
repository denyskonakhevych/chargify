package com.chargify.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogServiceAggregatorApplication {

	public static final String NOTIFICATIONS = "notifications";

	public static void main(String[] args) {
		SpringApplication.run(LogServiceAggregatorApplication.class, args);
	}
}
