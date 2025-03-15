package com.example.GeographyLeaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GeographyLeafApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(GeographyLeafApp.class, args);
		applicationContext.getBeanDefinitionNames();
	}

}
