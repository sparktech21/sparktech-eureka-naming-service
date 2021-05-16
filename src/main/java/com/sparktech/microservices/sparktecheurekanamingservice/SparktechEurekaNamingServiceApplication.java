package com.sparktech.microservices.sparktecheurekanamingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SparktechEurekaNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparktechEurekaNamingServiceApplication.class, args);
	}

}
