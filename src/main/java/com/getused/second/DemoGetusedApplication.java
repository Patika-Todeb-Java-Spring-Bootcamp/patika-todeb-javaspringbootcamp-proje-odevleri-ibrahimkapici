package com.getused.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class DemoGetusedApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGetusedApplication.class, args);
	}

}
