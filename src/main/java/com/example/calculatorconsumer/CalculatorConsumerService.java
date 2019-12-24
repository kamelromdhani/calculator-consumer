package com.example.calculatorconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RibbonClient( name = "simplecalculator" )
public class CalculatorConsumerService {
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate()
	{
	return new RestTemplate();
	}

	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CalculatorProxy calculatorProxy;
	
	public String add(int n1,int n2) {
        String response = restTemplate.getForObject("http://simplecalculator/add/{n1}/{n2}",
                String.class, n1, n2);
        System.out.println("Response:{}"+ response);
        return response;
    }
	
	
	public String sub(int n1,int n2) {
        String response = calculatorProxy.sub(n1, n2);
        System.out.println("Response:{}"+ response);
        return response;
    }

}
