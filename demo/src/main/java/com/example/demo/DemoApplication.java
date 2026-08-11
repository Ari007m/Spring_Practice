package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
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
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();

		dotenv.entries()
				.forEach(entry ->
						System.setProperty(
								entry.getKey(),
								entry.getValue()
						)
				);
		SpringApplication.run(DemoApplication.class, args);
	}

}
