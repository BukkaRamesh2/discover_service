package com.discover.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cards {

//IMPLENTING JAVA BASICS AND OOPS FEATURES
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cardId;
	private String cardNumber;
	private String cardType;
	private double cardLimit;
	private String status;
	private Date issueDate;
	private Date expiryDate;
	
	@Version
	private Integer version; 
		
	public Cards() {}
	
	
	//Constructor Overloading
	public Cards(Long cardId,String cardNumber, String cardType, double cardLimit, String status, Date issueDate, Date expiryDate) {
        this.cardId= cardId;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cardLimit = cardLimit;
        this.status = status;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
   
    }
	
	
	
	public Long getCardId() { return cardId; }
	
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

	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	



}


	














