package com.artarkatesoft.grabducklessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GrabDuckLessonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrabDuckLessonsApplication.class, args);
	}

}
