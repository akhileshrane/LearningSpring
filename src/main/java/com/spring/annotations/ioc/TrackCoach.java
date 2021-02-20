package com.spring.annotations.xml;

import org.springframework.stereotype.Component;

@Component("myTrackCoach") //default bean id - class name with lower case first char - trackCoach in this case
public class TrackCoach implements Coach {

	@Override
	public int performWorkout() {
		System.out.println("Working out..");
		return 0;
	}
	
}	
