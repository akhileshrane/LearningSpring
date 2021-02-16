package com.spring.annotations.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachSI implements Coach {
	
	
	private FortuneService fortuneService;
	
	public TennisCoachSI() {
		
	}
	
	@Autowired
	@Qualifier("fortuneHelperOne")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public int performWorkout() {
		return 0;
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
