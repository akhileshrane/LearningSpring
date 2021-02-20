package com.spring.annotations.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApp {

	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("annotations.xml");
		
		Coach track = ctx.getBean("myTrackCoach" , Coach.class);
		
		track.performWorkout();
		
		
		//close context
		ctx.close();
	}

}
