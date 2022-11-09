package com.cms.UML_CMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.cms.UML_CMS" })
@EntityScan("com.cms.UML_CMS")
@EnableJpaRepositories("com.cms.UML_CMS")
@Configuration
public class UmlCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmlCmsApplication.class, args);
	}

}
