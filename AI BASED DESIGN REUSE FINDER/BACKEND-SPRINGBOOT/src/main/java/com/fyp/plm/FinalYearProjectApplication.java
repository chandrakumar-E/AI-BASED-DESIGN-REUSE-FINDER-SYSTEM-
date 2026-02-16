package com.fyp.plm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
		"com.fyp.plm.auth.entity",
		"com.fyp.plm.plm.entity"
})
@EnableJpaRepositories(basePackages = {
		"com.fyp.plm.auth.repository",
		"com.fyp.plm.plm.repository"
})
public class FinalYearProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalYearProjectApplication.class, args);
	}
}
