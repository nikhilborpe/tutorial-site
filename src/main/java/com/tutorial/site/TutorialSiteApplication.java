package com.tutorial.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TutorialSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialSiteApplication.class, args);
	}

}
