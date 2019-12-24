package com.example.calculatorconsumer;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorConsumerController {
	
	@Autowired
	CalculatorConsumerService calculatorConsumerService;
	
	@GetMapping("/randomadd")
    public String randomAdd() {
        System.out.println("Calling Calculator Service: simplecalculator");
        Random random = new Random();
        return calculatorConsumerService.add(random.nextInt(),random.nextInt());
    }
	
	@GetMapping("/")
	public String getHealth() {
		return "application is up and running";
	}

}
