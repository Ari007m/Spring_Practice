package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoApplication {

	@Value("${spring.application.name}")
	private String appName;

	@PostConstruct
	public void printName() {}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
