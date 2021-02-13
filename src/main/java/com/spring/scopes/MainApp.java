package com.spring.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Singleton one = ctx.getBean("singleton", Singleton.class);
		one.setId(1);
		
		Singleton two = ctx.getBean("singleton", Singleton.class);
		two.setId(2);
		
		System.out.println("Memory Location of singleton 1,2: " + one + " \t " + two +  "\n " + (one==two));
	
		System.out.println(one.getId() + " \t "  + two.getId());
		
		Prototype p1 = ctx.getBean("prototype", Prototype.class);
		p1.setId(1);
		
		Prototype p2 = ctx.getBean("prototype", Prototype.class);
		p2.setId(2);
		
		System.out.println("Memory Location of singleton 1,2: " + p1 + " \t " + p2 +  "\n " + (p1==p2));
	
		System.out.println(p2.getId() + " \t " + p1.getId());
		
		ctx.close();
	}
}
