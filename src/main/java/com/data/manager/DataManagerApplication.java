package com.data.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
//@EnableScheduling
public class DataManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataManagerApplication.class, args);
	}

}
