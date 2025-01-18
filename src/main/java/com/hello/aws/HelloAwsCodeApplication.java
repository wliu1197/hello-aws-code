package com.hello.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hello")
public class HelloAwsCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAwsCodeApplication.class, args);
	}

}
