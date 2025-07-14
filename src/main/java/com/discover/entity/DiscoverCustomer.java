package com.discover.entity;


abstract class DiscoverCustomer {
	

	protected boolean gender;

	public DiscoverCustomer(boolean gender) {
		super();
		this.gender = gender;
	}
	
	public abstract void displayDetails();
	
	
	
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	

}
