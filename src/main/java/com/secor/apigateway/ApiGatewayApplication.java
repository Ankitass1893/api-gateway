package com.secor.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ApiGatewayApplication.class);

		// Set the active profile programmatically
		application.setAdditionalProfiles("dev");

		application.run(args);
	}



}
