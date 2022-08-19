package com.mysite.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.mysite.*")
@EnableJpaRepositories("com.mysite.*")
@ComponentScan(basePackages = { "com.mysite.*" })
@EntityScan("com.mysite.model")   
public class BookEcomDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookEcomDemoApplication.class, args);
	}

}
