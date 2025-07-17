package com.discover.uitl;

import com.discover.entity.Category;

public class CategoryTest {
	public static void main (String[] args) { 
		Category category = new Category();
        category.setcategoryID(101);
        category.setcategorytype(true); 
        category.setcategoryStatus("Completed"); 
        category.categorydate(System.currentTimeMillis());

        CategoryProcess processor = new CategoryProcess(category);
      
        processor.checkstatus();
		
	}

}
