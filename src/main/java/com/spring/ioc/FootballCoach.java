package com.spring.ioc;

public class FootballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "football practice - 06 minutes";
	}
	
}
