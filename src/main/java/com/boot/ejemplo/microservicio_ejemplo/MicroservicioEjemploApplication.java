package com.boot.ejemplo.microservicio_ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boot.ejemplo.controllers"})
public class MicroservicioEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEjemploApplication.class, args);
	}

}
