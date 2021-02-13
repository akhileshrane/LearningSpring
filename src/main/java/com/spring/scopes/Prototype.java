package com.spring.scopes;

public class Prototype {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//init method
	public void myInitMethod() {
		System.out.println("Initizaling ..");
	}
	

	//pre destroy method
	public void cleanupOnAisleN() {
		System.out.println("Destroying ..");
	}
}
