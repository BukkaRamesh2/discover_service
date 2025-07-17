package com.discover.service;

import java.util.List;

import com.discover.entity.Category;

public interface CategoryService {
	
	public Category addCategory(Category category); //you can define method with body 

	public Category getCategory(Long categoryId); //you can define method with body 

	public List<Category> getAllCategory();

	public Category updateCategory(Category category);


}
