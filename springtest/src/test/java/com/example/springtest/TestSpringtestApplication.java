package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringtestApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringtestApplication::main).with(TestSpringtestApplication.class).run(args);
	}

}
