package com.discover.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;
import jakarta.persistence.Version; 

@Entity 
public class Fee {
	
	/*
	 * feeId - unique ID for all fees generate in bank similar to transactionID
	 * feeName - short name where customer can see what kind of fee they got eg: Over Draft, late payment etc.
	 * amount - what is the fee amount.
	 * deadline - The date by which the fee must be paid.
	 * Active - Is fee is still active true: customer should pay. false : paid or not yet assigned.
	 * description - explain why fee is added to their account or describing the fee policies.
	 */
	@Id
    private String feeId;

    private String feeName;

    private long amount;

    private LocalDate deadline;

    private boolean Active;

    private String description;
    

    public Fee() {
        
    }

    public Fee(String feeId, String feeName, long amount, LocalDate deadline, boolean Active, String description) {
        this.feeId = feeId;
        this.feeName = feeName;
        this.amount = amount;
        this.deadline = deadline;
        this.Active = Active;
        this.description = description;
    }

    public String getFeeId() {
        return feeId;
    }

    public String getFeeName() {
        return feeName;
    }

    public long getAmount() {
        return amount;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    // 5. REVERTED: Changed back to getActive() as requested.
    public boolean getActive() {
        return Active;
    }

    public String getDescription() {
        return description;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setActive(boolean active) {
        this.Active = active;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
  
}
