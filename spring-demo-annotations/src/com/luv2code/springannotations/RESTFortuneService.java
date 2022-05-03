package com.luv2code.springannotations;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "I am in RESTFortuneService ";
	}

}
