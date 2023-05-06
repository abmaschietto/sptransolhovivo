package com.artucrop.sptrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpTransOlhoVivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpTransOlhoVivoApplication.class, args);
	}

}
