package com.namanraj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.namanraj.demo.controller","com.namanraj.demo.dao" , "com.namanraj.demo.model"})
public class ComplaintPortalApplication { 

	public static void main(String[] args) {
		SpringApplication.run(ComplaintPortalApplication.class, args);
	}

}
