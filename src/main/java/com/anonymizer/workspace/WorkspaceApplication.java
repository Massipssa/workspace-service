package com.anonymizer.workspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;


@EntityScan(basePackages = {"com.anonymizer.workspace.model"})
@EnableJpaRepositories("com.anonymizer.workspace.repository")
@SpringBootApplication(scanBasePackages={
		"com.anonymizer.workspace.controller",
		"com.anonymizer.workspace.repository",
		"com.anonymizer.workspace.service",
		},
		exclude = {SecurityAutoConfiguration.class})
public class WorkspaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkspaceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return  new RestTemplate();
	}
}
