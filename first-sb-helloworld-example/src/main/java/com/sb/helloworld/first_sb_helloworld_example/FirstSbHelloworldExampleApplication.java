package com.sb.helloworld.first_sb_helloworld_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSbHelloworldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSbHelloworldExampleApplication.class, args);
		System.out.println("this is first spring boot application");
	}

}
