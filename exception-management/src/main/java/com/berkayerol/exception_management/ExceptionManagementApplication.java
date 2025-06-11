package com.berkayerol.exception_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.berkayerol"}) //Entity'leri görmesi için
@EnableJpaRepositories(basePackages = {"com.berkayerol"}) //jpa repository i görmesi için
@ComponentScan(basePackages = {"com.berkayerol"}) //Restcontroller service repository'i (anatasyonları) görmesi için
@SpringBootApplication
public class ExceptionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementApplication.class, args);
	}

}
