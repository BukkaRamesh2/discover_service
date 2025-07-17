package com.discover.uitl;

import com.discover.entity.Category;


public class CategoryProcess extends CategoryAction {
	
	public CategoryProcess(Category category) {
		super(category);
	}

	@Override
	public void checkstatus() {
		// TODO Auto-generated method stub
		if (category.categoryStatus().equalsIgnoreCase("Completed")) {
			System.out.println("Completed");
		}
		else {
			System.out.println("Pending");
		}
	}
	public void displayinfo() {
		System.out.println("Category Details" );
		System.out.println("categoryId  :- "+category.getcategoryID());
		System.out.println("Category Type :- "+category.categorytype());
		System.out.println("Category Status :- "+category.categoryStatus());
		System.out.println("Date :- "+category.getcategorydate());
	}

}
