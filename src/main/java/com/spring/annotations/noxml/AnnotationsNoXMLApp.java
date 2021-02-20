package com.spring.annotations.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotations.di.Coach;
import com.spring.annotations.di.TennisCoachFI;

public class AnnotationsNoXMLApp {

	
	
	public static void main(String[] args) {
		//load the spring conf file
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaBeansConfig.class);
		
		Coach tennisCoach = ctx.getBean("tennisCoach" , Coach.class);
			
		tennisCoach.getFortune(); //dependency injection using Autowiring
		
		Coach tennisCoachSI = ctx.getBean("tennisCoachSI", Coach.class);
		
		tennisCoachSI.getFortune(); //setter injection
		Coach tennisCoachFI = ctx.getBean("tennisCoachFieldInjection", Coach.class);
		System.out.println(tennisCoachFI.getFortune()); //field injection
		
		TennisCoachFI tennisCoach1 = ctx.getBean("tennisCoachFieldInjection", TennisCoachFI.class);
		System.out.println(tennisCoachFI.getFortune()); //field injection
		
		
		System.out.println("Name: " + tennisCoach1.getName() + " Email: " + tennisCoach1.getEmail());
		//close context
		ctx.close();
	}


}
