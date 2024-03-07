package com.am.skillmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SkillMakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillMakerApplication.class, args);
	}

}
