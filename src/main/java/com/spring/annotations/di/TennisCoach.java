package com.spring.annotations.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Qualifier("fortuneHelperOne")
	private FortuneService fortuneHelperOne;
	
	
	@Autowired
	public TennisCoach(FortuneService fortuneHelperOne) {
		this.fortuneHelperOne = fortuneHelperOne;
	}
	
	@Override
	public int performWorkout() {
		System.out.println("Stretching out before playing tennis.");
		return 0;
	}
	
	@Override
	public String getFortune() {
		return fortuneHelperOne.getFortune();
	}

	
}
