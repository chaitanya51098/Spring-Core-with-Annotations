package com.luv2code.springannotations;

import com.luv2code.springdemo.FortuneService;

public class RugbyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Heal from injuries daily !";
	}

}
