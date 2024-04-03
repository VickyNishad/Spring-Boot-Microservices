package com.users.userservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;


@Configuration
public class KafkaConfig {
	
	
	@KafkaListener(topics = "message", groupId = "group-1")
	public void listenKakfa(String message) {
		System.out.println("message: "+message);
	}

}
