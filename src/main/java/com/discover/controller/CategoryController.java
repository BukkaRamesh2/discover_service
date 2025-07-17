package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Category;
import com.discover.entity.Customer;
import com.discover.service.CategoryService;
import com.discover.service.CustomerService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/category")

public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@PostMapping("/addCategory")
	public Category addCategory(@RequestBody Category category){
		return categoryService.addCategory(category);
		
	}
	
	@GetMapping("/getCategory/{categoryID}")
	public Category getCategory(@PathParam("categoryID") Long categoryID){
		return categoryService.getCategory(categoryID);
	}
	
	@GetMapping("/getAllCategory")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
	@PutMapping("/updateCategory")
	public Category updateCategory(@RequestBody Category category){
		return categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/deleteCategory/{categoryID}")
	public void deleteCategory(@PathParam("categoryID") Long categoryID){
		
	}
	
	

}
