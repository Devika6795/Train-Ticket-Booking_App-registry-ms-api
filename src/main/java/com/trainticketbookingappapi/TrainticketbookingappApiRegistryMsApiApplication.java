package com.trainticketbookingappapi;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class TrainticketbookingappApiRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainticketbookingappApiRegistryMsApiApplication.class, args);
	}

}
