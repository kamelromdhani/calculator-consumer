package com.example.calculatorconsumer;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "simplecalculator")
@RibbonClient(name = "simplecalculator")
public interface CalculatorProxy {
	
	@GetMapping("/sub/{num1}/{num2}")
	public String sub(@PathVariable(value="num1") Integer num1, @PathVariable(value="num2") Integer num2);

}
