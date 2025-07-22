package com.discover.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "support") // Explicit table name
@Builder
public class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Add auto-generation
    private Long supportId;
    private String customerName;
    private String description;
    private Date createDate;
    private String status;

    // Constructor
    public Support(Long supportId, String customerName, String description, Date date, String status) {
        this.supportId = supportId;
        this.customerName = customerName;
        this.description = description;
        this.createDate = date;
        this.status = status;
    }

    public Long getSupportId() {
        return supportId;
    }

    public void setSupportId(Long supportId) {
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

