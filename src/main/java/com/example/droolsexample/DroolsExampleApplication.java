package com.example.droolsexample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DroolsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsExampleApplication.class, args);
	}

	@Bean
	public KieContainer getKieContainer(){
		return KieServices.Factory.get().getKieClasspathContainer();
	}
}
