package com.example.wrestling_show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.wrestling_show")

public class WrestlingShowSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WrestlingShowSpringApplication.class, args);
	}

}
