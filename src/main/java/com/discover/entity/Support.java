package com.discover.entity;

import java.util.Date;

public class Support {
	private int supportId;
    private String customerName;
    private String description;
    private Date createDate;
    private String status;

    // Constructor
    public Support(int supportId, String customerName, String description, Date date, String status) {
        this.supportId = supportId;
        this.customerName = customerName;
        this.description = description;
        this.createDate = date;
        this.status = status;
    }

    public int getSupportId() {
        return supportId;
    }

    public void setSupportId(int supportId) {
        this.supportId = supportId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

	public void setStatus(String status) {
		this.status = status;
	}


}

