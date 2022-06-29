package com.mysite.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.mysite.main")
public class ConceptsSbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConceptsSbootApplication.class, args);
	}

}
