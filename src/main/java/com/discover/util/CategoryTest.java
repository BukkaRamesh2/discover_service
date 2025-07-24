package com.discover.util;

import com.discover.entity.Category;

public class CategoryTest extends Category{
	
	 
	
	
	public Category category;    // aggrigation 
	
	
	public void testMethod() {
		System.out.println("inside test class");
	}
	
	
	public CategoryTest(Long categoryID, Category category, boolean categorytype, long categorydate, String categorystatus) {
		this.category = category;
	}


	public CategoryTest() {
		// TODO Auto-generated constructor stub
	}


	public static void main (String[] args) {
		CategoryTest  categorytest = new CategoryTest();
		categorytest.category.displayinfo();
		
		//t.customer.getDiscCustomer(); //  
	}
	
	
	public void categorytest(){
		
	}

}
