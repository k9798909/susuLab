package com.example.SpringbootApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SpringbootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiApplication.class, args);
	}

}
