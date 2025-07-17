package com.discover.uitl;

import com.discover.entity.Category;

public abstract class CategoryAction {
	protected Category category;
	public CategoryAction (Category category) {
		this.category = category;
	}
	
	public abstract void checkstatus();

}
