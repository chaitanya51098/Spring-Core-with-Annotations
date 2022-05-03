package com.luv2code.springannotations;

import org.springframework.stereotype.Component;

@Component
public class HealthKitItems implements HealthKit {

	@Override
	public String Items() {
		return "Glucose is available for energy ";
	}

}
