package com.example.calculatorconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class CalculatorConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorConsumerApplication.class, args);
	}
	

}
