package com.springsecurity;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		

		ArrayList< String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("what");
		list.add("is");
		list.add("java");
		
		
		list.forEach((str) ->{
			System.out.println(str);
		});
		
		
	}

}
