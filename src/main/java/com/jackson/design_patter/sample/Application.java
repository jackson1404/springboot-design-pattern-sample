package com.jackson.design_patter.sample;

import com.jackson.design_patter.sample.factory_pattern.service.NotificationService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private NotificationService notificationService;

	@PostConstruct
	public void init(){
		notificationService.notify("PUSH", "wmt", "hello");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
