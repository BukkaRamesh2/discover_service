package com.discover.entity;

public class Category {

   private int categoryID;
   protected boolean categorytype;
   private long  categorydate;
   private boolean categorystatus;



   
   


    public int getcategoryID() {
        return categoryID;
    }

    public void setcategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    
    public boolean categorytype() {
        return categorytype;
    }

    public void setcategorytype(boolean categorytype) {
        this.categorytype = categorytype;
    }

    
    public long getcategorydate() {
		return categorydate;
	}

	public void categorydate(long categorydate) {
		this.categorydate = categorydate;
	}
    
    public boolean  categoryStatus() {
        return categorystatus;
    }

    public void setcategoryStatus(boolean categorystatus) {
        this.categorystatus = categorystatus;
    
    }
   
}