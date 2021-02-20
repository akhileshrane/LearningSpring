package com.spring.annotations.di;

import org.springframework.stereotype.Component;

@Component
public class FortuneHelperOne implements FortuneService {

	@Override
	public String getFortune() {
		System.out.println("you will have a good day today, maybe");
		return null;
	}
	
}	
