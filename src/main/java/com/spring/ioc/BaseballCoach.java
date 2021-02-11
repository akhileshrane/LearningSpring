package com.spring.ioc;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Batting practice - 30 minutes";
	}

	
}
