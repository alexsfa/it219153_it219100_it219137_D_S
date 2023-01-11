package com.Hometract.Hometract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class HometractApplication {

	public static void main(String[] args) {
		SpringApplication.run(HometractApplication.class, args);
	}

}
