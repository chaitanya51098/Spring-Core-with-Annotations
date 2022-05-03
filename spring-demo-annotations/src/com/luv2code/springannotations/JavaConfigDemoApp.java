package com.luv2code.springannotations;

import java.io.FileNotFoundException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) throws FileNotFoundException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		BadmintonCoach coach = context.getBean("badmintonCoach", BadmintonCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getCountry());
		System.out.println(coach.getPlayer());
		// System.out.println(coach.HealthItems());
		context.close();
	}

}
