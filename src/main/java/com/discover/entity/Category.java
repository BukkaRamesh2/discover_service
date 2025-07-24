package com.discover.entity;

public class Category {

   protected long categoryID;
   protected boolean categorytype;
   private long  categorydate;
   private String categorystatus;



   
   


    public long getcategoryID() {
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
    
    public String categoryStatus() {
        return categorystatus;
    }

    public void setcategoryStatus(String categorystatus) {
        this.categorystatus = categorystatus;
    
    }

	public void displayinfo() {
		// TODO Auto-generated method stub
		
		
	}
   
}