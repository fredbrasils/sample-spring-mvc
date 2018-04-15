package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.sample.controller","com.sample.model","com.sample.service","com.sample.repository"
							 ,"com.sample.configuration"})
@EnableAutoConfiguration
public class SampleSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringMvcApplication.class, args);
	}
}
