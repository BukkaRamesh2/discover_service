package com.discover.util;

import com.discover.entity.Customer;
import com.discover.entity.DiscoverCustomer;

public class Test extends Customer{
	
	
	public String testData;  //
	
	
	public DiscoverCustomer customer;    // aggrigation 
	
	
	public void testMethod() {
		System.out.println("inside test class");
	}
	
	
	public Test(Long customerID, String firstName, String lastName, String address, String email, Long phoneNumber,
			boolean gender, boolean status, String name, Integer age, DiscoverCustomer customer) {
		super(customerID, firstName, lastName, address, email, phoneNumber, gender, status, name, age);
		this.customer = customer;
	}


	public Test() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		Customer c = new Customer();   // 4% , 5%, 7%
		Test  t = new Test();
		//t.customer.getDiscCustomer(); //  
	}
	
	
	public void test(){
	}

}
