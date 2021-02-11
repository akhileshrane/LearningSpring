package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive a bean from Spring container
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		
		//Coach theCoach = ctx.getBean("baseballCoach", Coach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		
		
		//close context
		ctx.close();
	}

}
