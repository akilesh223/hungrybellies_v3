package com.cuboulder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodDeliveryApi {

	public static void main(String[] args) {
		//Calling Static method by passing the name of the class
		SpringApplication.run(FoodDeliveryApi.class, args);
		
	}

}
