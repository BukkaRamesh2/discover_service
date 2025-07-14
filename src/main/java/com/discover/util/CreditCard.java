package com.discover.util;

import java.util.Date;

import com.discover.entity.Cards;


	public class CreditCard extends Cards implements CardOperations {
	
	public CreditCard(long cardId, String cardNumber, double CardLimit, Date issueDate, Date expiryDate) {
		super(cardId, cardNumber, "Credit",CardLimit, "Inactive",issueDate, expiryDate);
	}
	
	//Method Overriding...........
	
	@Override
	public void activateCard()
	{
		setStatus("Active");
		System.out.println("Credit Card Activated");
	}
	
	@Override
	public void deactivateCard()
	{
		setStatus("Inactive");
		System.out.println("Credit Card Deactivated");
	}
	@Override
	public double checkLimit()
	{
		return getCardLimit();
	}
	
	
	//Method Overloading.......
	public void displayCardInfo(Cards card) {
		System.out.println("Card Number: " + card.getCardNumber());
        System.out.println("Card Type: " + card.getCardType());
        System.out.println("Card Status: " + card.getStatus()); 
	    }
	
	
//	displaycardInfo(mycard);  ---> number, type, status
//	
//	displaycardInfo(mycard, true) ---> number, type, status, cardlimit
	

	public void displayCardInfo(Cards card, boolean showLimit) {  // showlimit true or false
		//displayCardInfo(card);
		
		System.out.println("Card Number: " + card.getCardNumber());
        System.out.println("Card Type: " + card.getCardType());
        System.out.println("Card Status: " + card.getStatus()); 
	    if (showLimit) {
	    	System.out.println("Card Limit: " + card.getCardLimit());
	     }
	    }

   public void checkStatus(Cards card) {
	   //Branching statements
	   switch (card.getStatus()) {
	   case "Active":
		   System.out.println("Card is Active");
		   break;
        case "Inactive":
            System.out.println("Card is Inactive");
            break;
        default:
            System.out.println("Unknown Card Status");
	        }
	    }	
	
	


}
