package com.luv2code.springannotations;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "I am in HappyFortune Service";
	}

}
