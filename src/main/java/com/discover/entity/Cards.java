package com.discover.entity;
import java.util.Date;


public class Cards {

//IMPLENTING JAVA BASICS AND OOPS FEATURES
	

	private long cardId;
	private String cardNumber;
	private String cardType;
	private double cardLimit;
	private String status;
	private Date issueDate;
	private Date expiryDate;
	
	
	public Cards() {}
	
	//Constructor Overloading
	public Cards(long cardId,String cardNumber, String cardType, double cardLimit, String status, Date issueDate, Date expiryDate) {
        this.cardId= cardId;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cardLimit = cardLimit;
        this.status = status;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }
	
	
	
	public long getCardId() { return cardId; }
	
	public String getCardNumber() { return cardNumber; }
	
	public String getCardType() { return cardType; }
	
	public double getCardLimit() { return cardLimit; }
	
	public String getStatus(){ return status;  }
	
	public Date getIssueDate(){  return issueDate;  }
	
    public Date getExpiryDate() { return expiryDate;  }
    

    /*
     * public void setCardId(int cardId)  { this.cardId=cardId; }
     */
	
	public void setCardType(String cardType) { this.cardType=cardType; }
	
	public void setCardLimit(double cardLimit) { this.cardLimit = cardLimit; }
	
	public void setStatus(String status) { this.status = status; }
	
	public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }
	
	public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }
}


	














