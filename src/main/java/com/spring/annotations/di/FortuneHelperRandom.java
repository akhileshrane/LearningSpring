package com.spring.annotations.di;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") @Scope("prototype")
public class FortuneHelperRandom implements FortuneService {
	
	@PostConstruct
	public void runAfterConstruction() {
		System.out.println("Running Random Fortune Helper");
	}
	
	private String[] fortunes = {
			"A beautiful, smart, and loving person will be coming into your life.",
			"A dubious friend may be an enemy in camouflage.",
			"A faithful friend is a strong defense.",
			"A feather in the hand is better than a bird in the air.",
			"A fresh start will put you on your way.",
			"A friend asks only for your time not your money."
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		String fortune = fortunes[index];
		return fortune;
	}
	

	@PreDestroy
	public void runBeforeBeanDestruction() {
		System.out.println("Closing Random Fortune Helper");
	}
	
}
