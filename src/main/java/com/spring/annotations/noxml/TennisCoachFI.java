package com.spring.annotations.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoachFieldInjection")
public class TennisCoachFI implements Coach {
	
	@Autowired
	@Qualifier("fortuneHelperRandom")
	//no need for constructor injection/method injection - field injection uses Reflection
	private FortuneService fortuneService;
	
	@Override
	public int performWorkout() {
		return 0;
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
