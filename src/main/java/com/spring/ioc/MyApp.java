package com.spring.ioc;

public class MyApp {

	public static void main(String[] args) {
		 
		
		//create object
		Coach theCoach = new BaseballCoach();
		Coach footyCoach = new FootballCoach();
		
		//use object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(footyCoach.getDailyWorkout());

	}

}
