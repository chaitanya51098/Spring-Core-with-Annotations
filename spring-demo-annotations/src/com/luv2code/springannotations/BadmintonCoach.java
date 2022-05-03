package com.luv2code.springannotations;

import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

//bean id over class
@Component
public class BadmintonCoach implements Coach {

	// field injection - ( here the implementation class is injected automatically
	// by
	// concept of reflection)

	private HealthKit healthKit;

	// if there are multiple classes for DI, to use specific classs,
	// we use @Qualifier annotation
	// @Qualifier("databaseFortuneService")
	private FortuneService fortuneService;

	@Autowired
	@Qualifier("readTextfromFile")
	private ReadTextfromFile file;

	@Value("${foo.player}")
	private String player;
	@Value("${foo.country}")
	private String country;

	/*
	 * @Autowired ( constructor injection) // public BadmintonCoach(HealthKit
	 * healthKit) { // super(); // this.healthKit = healthKit; }
	 */

	// setter injection
//	@Autowired
//	public void setHealthKit(HealthKit healthKit) {
//		this.healthKit = healthKit;
//	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice badminton twice a day !";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException {
		return file.FortunesfromFile();
	}
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("Test Post Construct");
	}	
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("Test Pre detroy");
	}

	public String HealthItems() {
		return healthKit.Items();

	}

}
