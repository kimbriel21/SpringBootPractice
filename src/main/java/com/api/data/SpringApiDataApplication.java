package com.api.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.api.data","com.api.data.topic"} )
//@EnableJpaRepositories("com.api.data.topic")
//@EntityScan(basePackages = "com.api.data.topic")
public class SpringApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiDataApplication.class, args);
	}

}
