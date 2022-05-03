package com.luv2code.springannotations;

import java.io.FileNotFoundException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) throws FileNotFoundException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"annotations-applicationContext.xml");
		BadmintonCoach coach = context.getBean("badmintonCoach", BadmintonCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getCountry());
		System.out.println(coach.getPlayer());
		//System.out.println(coach.HealthItems());
		context.close();
	}

}
