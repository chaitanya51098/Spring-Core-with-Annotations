package com.luv2code.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Configuration
@PropertySource("sport.properties")
//@ComponentScan("com.luv2code.springannotations")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	////IOC - Creating and managing objects
	@Bean
	public RugbyFortuneService rugbyFortuneService() {
		return new RugbyFortuneService();
	}
	//IOC - Creating and managing objects
	@Bean
	public RugbyCoach rugbyCoach() {
		return new RugbyCoach();
	}

}