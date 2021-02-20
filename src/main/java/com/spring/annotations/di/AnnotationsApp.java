package com.spring.annotations.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApp {

	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("annotations.xml");
		
		Coach tennisCoach = ctx.getBean("tennisCoach" , Coach.class);
			
		tennisCoach.getFortune(); //dependency injection using Autowiring
		
		Coach tennisCoachSI = ctx.getBean("tennisCoachSI", Coach.class);
		
		tennisCoachSI.getFortune(); //setter injection
		
		
		Coach tennisCoachFI = ctx.getBean("tennisCoachFieldInjection", Coach.class);
		System.out.println(tennisCoachFI.getFortune()); //field injection
		
		//close context
		ctx.close();
	}

}
