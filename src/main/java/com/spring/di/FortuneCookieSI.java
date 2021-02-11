package com.spring.di;

public class FortuneCookieSI implements Fortune {
	private FortuneHelper fortuneHelper;
	
	private String fortuneGiver;
	private int fortuneGiverID;

	//setter injection requires default no-arg constructor to call setter upon
	public FortuneCookieSI () {
		System.out.println("Inside no-arg constructor");
	}


	public String getFortuneGiver() {
		return fortuneGiver;
	}


	public int getFortuneGiverID() {
		return fortuneGiverID;
	}


	public void setFortuneGiver(String fortuneGiver) {
		System.out.println("Setting fortune giver name");
		this.fortuneGiver = fortuneGiver;
	}


	public void setFortuneGiverID(int fortuneGiverID) {
		System.out.println("Setting ID");
		this.fortuneGiverID = fortuneGiverID;
	}


	public void setFortuneHelper(FortuneHelper fortuneHelper) {
		System.out.println("Inside setter method");
		this.fortuneHelper = fortuneHelper;
	}


	@Override
	public String getFortune() {
		return fortuneHelper.getFortuneCookie();
	}

}
