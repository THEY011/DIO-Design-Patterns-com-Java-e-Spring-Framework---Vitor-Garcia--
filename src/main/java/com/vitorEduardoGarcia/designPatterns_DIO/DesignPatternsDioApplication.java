package com.vitorEduardoGarcia.designPatterns_DIO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignPatternsDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsDioApplication.class, args);
	}

}
