package com.security.jwt_token_validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class JwtTokenValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtTokenValidatorApplication.class, args);
	}

}