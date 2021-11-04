package com.talentyco.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.talentyco.bisogne.common.entity", "com.talentyco.springboot.admin.user"})
public class ProjectBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBackEndApplication.class, args);
	}

}
