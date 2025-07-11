package com.discover.entity;

public class Support{
	private int supportId;
    private String customerName;
    private String description;
    private Date createDate;
    private String status;

    // Constructor
    public Support(int supportId, String customerName, String description, Date createDate, String status) {
        this.supportId = supportId;
        this.customerName = customerName;
        this.description = description;
        this.createDate = createDate;
        this.status = status;
    }      
}