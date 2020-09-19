package com.springcloud.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OcTestGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcTestGradleApplication.class, args);
	}
	
	@RequestMapping(value = "/checkout")
	public String checkout() {
		return "This is checkout response";		
	}	
	
	@RequestMapping(value = "/")
	public String home() {
		return "Welcome to spring boot";		
	}	

}
