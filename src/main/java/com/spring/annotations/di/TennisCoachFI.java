package com.spring.annotations.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tennisCoachFieldInjection")
public class TennisCoachFI implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}


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
