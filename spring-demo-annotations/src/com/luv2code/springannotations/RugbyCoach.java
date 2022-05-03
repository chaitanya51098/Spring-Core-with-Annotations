package com.luv2code.springannotations;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.springdemo.Coach;

public class RugbyCoach implements Coach {
	
	//Dependency Injection by field name
	@Autowired
	private RugbyFortuneService rugbyFortuneService;

//	public RugbyCoach(RugbyFortuneService rugbyFortuneService) {
//		super();
//		this.rugbyFortuneService = rugbyFortuneService;
//	}

	public RugbyCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Watch Sye movie daily !";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException {
		return rugbyFortuneService.getFortune();
	}

}
