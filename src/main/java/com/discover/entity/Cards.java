package com.discover.entity;
import java.util.Date;
public class Cards {


//	cardId
//	 *     cardType
//	 *     issueDate
//	 *     expiryDate
//	 *     cardLimit
//	 *     status
	private int    cardId;
	private String cardType;
	private double cardLimit;
	private String status;
	private Date issueDate;
	private Date expiryDate;
	
	public Cards(int cardId, String cardType, double cardLimit, String status, Date issueDate, Date expiryDate) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.cardLimit = cardLimit;
        this.status = status;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }
	
	
	
	
	
	
	public int getCardId() {
		return cardId;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public double getCardLimit() {
	        return cardLimit;
    }
	
	public String getStatus(){
	        return status;
	}
	public Date getIssueDate(){
	        return issueDate;
	    }
	
    public Date getExpiryDate() {
	        return expiryDate;
    }
    
    
    

    /*
     * public void setCardId(int cardId)
     * {
     * this.cardId=cardId;
     * }
     */
	
	public void setCardType(String cardType)
	{
		this.cardType=cardType;
	}
	
	public void setCardLimit(double cardLimit) {
        this.cardLimit = cardLimit;
    }
	
	public void setStatus(String status) {
        this.status = status;
    }
	
	public void setIssueDate(Date issueDate) {
	        this.issueDate = issueDate;
	    }
	
	
	public void setExpiryDate(Date expiryDate) {
	        this.expiryDate = expiryDate;
	    }





//testingg the methods 
//public static void main(String[] args) {
//    Cards card = new Cards(101, "Credit", 25000.00,"Active",new Date(),new Date(System.currentTimeMillis() + 31536000000L));
//
//    
//   
//    // Print values
//    System.out.println("Card ID: " + card.getCardId());
//    System.out.println("Card Type: " + card.getCardType());
//    System.out.println("Card Limit: " + card.getCardLimit());
//    System.out.println("Status: " + card.getStatus());
//    System.out.println("Issue Date: " + card.getIssueDate());
//    System.out.println("Expiry Date: " + card.getExpiryDate());
//}
}
















