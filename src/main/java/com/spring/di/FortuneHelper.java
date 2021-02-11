package com.spring.di;

public class FortuneHelper {
	
	
	
	public String getFortune() {
		String[] fortunes = {"You will have a nice day today","Nope", "You will die today"};
		double rand =  Math.random()*1000 % 3;
		return fortunes[(int) rand] ;
	}
	
	
	public String getFortuneCookie() {
		return " \t \t * \t \n * \t  Fuck you \t * \n \t  * \t \t \n";
	}
}
