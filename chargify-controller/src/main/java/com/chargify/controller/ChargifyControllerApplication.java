package com.chargify.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.chargify")
@SpringBootApplication
public class ChargifyControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChargifyControllerApplication.class, args);
	}
}
