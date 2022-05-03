package com.luv2code.springannotations;

import java.io.FileNotFoundException;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService sadFortuneService) {
		this.fortuneService = sadFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice swimming twice a day !";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException {
		return fortuneService.getFortune();
	}

}
