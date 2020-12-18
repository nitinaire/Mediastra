package com.finastra.FinastraHelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan("com.finastra")
@EntityScan("com.finastra")
@EnableJpaRepositories("com.finastra")
@SpringBootApplication
public class FinastraHelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinastraHelpApplication.class, args);
	}

}
