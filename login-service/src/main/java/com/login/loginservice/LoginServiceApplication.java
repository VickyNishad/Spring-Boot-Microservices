package com.login.loginservice;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoginServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginServiceApplication.class, args);
		

		ArrayList< String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("what");
		list.add("is");
		list.add("java");
		
		
		list.forEach((str)-> str.equals("hi"));
		
		
	}

}
