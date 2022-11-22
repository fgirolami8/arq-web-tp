package com.arq.integrador3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Integrador3Application {

	public static void main(String[] args) {
		System.setProperty("maven.version", "3.6.2");
		SpringApplication.run(Integrador3Application.class, args);
	}

}
