package com.stg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@SpringBootApplication
public class OAuthResourceApplication{

	public static void main(String[] args) {
		SpringApplication.run(OAuthResourceApplication.class, args);
	}

}
