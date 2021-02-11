package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISpringApp {

	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive a bean from Spring container
		Fortune fortune = ctx.getBean("myFortuneCoach", Fortune.class);
		Fortune fortuneCookie = ctx.getBean("myFortuneCookie", Fortune.class);
		
		//call methods
		System.out.println(fortune.getFortune()); //constructor injection
		System.out.println(fortuneCookie.getFortune()); //setter injection
	
		System.out.println(fortuneCookie.getFortuneGiver());
		System.out.println(fortuneCookie.getFortuneGiverID());
		
		//close context
		ctx.close();
	}

}
