package com.spring.di;


public class FortuneCoach implements Fortune{
	
	private FortuneHelper fortuneHelper;
	
	public FortuneCoach(FortuneHelper fortuneHelper) {
		System.out.println("Inside constructor");
		this.fortuneHelper = fortuneHelper;
	}
	
	public String getFortune() {
		return fortuneHelper.getFortune();
	}

	@Override
	public String getFortuneGiver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getFortuneGiverID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
