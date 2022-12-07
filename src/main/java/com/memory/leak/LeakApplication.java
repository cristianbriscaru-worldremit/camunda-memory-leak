package com.memory.leak;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class LeakApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeakApplication.class, args);
	}

}
