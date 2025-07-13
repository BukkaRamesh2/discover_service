package com.discover.entity;
import java.time.LocalDate;
import java.time.LocalTime;
public class Transaction 
{
	 public     int  transactionId;
	 public     String  transactionType;
	 public     LocalDate date;
	 public     LocalTime time;
	 public     float  amount;
	 
	 public String getTransactionType() 
	 {
		return transactionType;
	}
	 public void setTransactionType(String transactionType) 
	 {
		 this.transactionType = transactionType;
	 }
	 public LocalDate getDate() 
	 {
		 return date;
	 }
	 public void setDate(LocalDate date) 
	 {
		 this.date = date;
	 }
	 public int getTransactionId()
	 {
		return transactionId;
	}
	 public void setTransactionId(int transactionId)
	 {
		 this.transactionId = transactionId;
	 }
	 public LocalTime getTime() 
	 {
		 return time;
	 }
	 public void setTime(LocalTime time) 
	 {
		 this.time = time;
	 }
	 public float getAmount() 
	 {
		 return amount;
	 }
	 public void setAmount(float amount) 
	 {
		 this.amount = amount;
	 }
	 
	 public void Trans() 
	 {    //method overiding
		 System.out.println(" The transaction details:");
	 }
	 public void Trans(int  transactionId,String  transactionType) //method overloading -2 parameters
	 {
		 this.transactionId=transactionId;
		 this.transactionType=transactionType;
	 }
	 
	 public void Trans(int  transactionId,float  amount,LocalDate datestamp) //method overloading -3 parameters
	 {
		 this.transactionId=transactionId;
		 this.amount=amount;
		 this.date= datestamp;
		 
	 }
	 public Transaction()// constructor with no args
	 {
		 
	 }
	
	 
	 public Transaction(int  transactionId,float  amount) //Constructor with 3 parameters
    {
		 this.transactionId=transactionId;
		 this.amount=amount;
		 
    }
	 
	 public Transaction( LocalDate datestamp,String  transactionType)  ////Constructor with 2 parameters
	 {
		 this.date=datestamp;
		 this.transactionType=transactionType;
	 }
    
	  public interface Transdetails
	  {     //abstract class
		  public void secretdata();
	  }
	  public void Amount_Condition()
	  {
		  if(amount>=0)
		  {
			  System.out.println("Amount has overdrwan ,no balance");
		  }
		  else
		  {
			  System.out.println("Funds are sufficeint");
		  }
	  }
	  
	  public void Transid_condition()
	  {
		  if (transactionType == null) {
		        System.out.println("Transaction type not defined ");
		  }
		  else if ((transactionType.equals("Savings") || transactionType.equals("Loan")) && amount <= 0) 
	     {
			System.out.println("Amount can be withdrawn");
		 }
		  else if ((transactionType.equals("Savings") || transactionType.equals("Loan")) && amount >= 0)
		  {
			  
			  System.out.println("Amount cannot be withdrawn,no funds");
	
           }
		  else
			  System.out.println("Check details ");
	  
	  } 
	 
	  public void amountcondition()
	  {
		  do {
			  System.out.println("amount :" +amount);
			  
		  }while(amount<0);
	  }
	  
	  public void condition() { 
		  
		  if (transactionType == null) {
		        System.out.println("Transaction type is not set.");
		        return;
		    }
		  
		    switch (transactionType) {   //switch
		        case "Savings":
		            System.out.println("Savings Account");
		            break;
		        case "Loan":
		            System.out.println("Loan Account");
		            break;
		        case "Refund":
		            System.out.println("Refund Issued");
		            break;
		        default:
		            System.out.println("Unknown");
		            break;
		    }
		}


	  public static void main (String[] args)
 {
	
	Transaction t =new Transaction(100,1000);  //constructor
	Transaction t1 =new Transaction(LocalDate.of(2025, 7, 13), "Refund");  //constructor
	t.Trans();
	System.out.println("Trans ID: "+ t.getTransactionId());
    System.out.println("Amount: " + t.getAmount());
    System.out.println("Date: " + t1.getDate());
    System.out.println("Type: " + t1.getTransactionType());
	Transaction t2 =new Transaction();     //method 
	t2.Trans(100,"loan");
	System.out.println("Trans ID: "+ t2.getTransactionId());
	System.out.println("Type: " + t2.getTransactionType());
	Transaction t3 =new Transaction();    //method
	t3.Trans(100,1000,LocalDate.of(2025, 7, 15));
	System.out.println("Trans ID: "+ t3.getTransactionId());
	System.out.println("Amount: " + t3.getAmount());
	System.out.println("Date: " + t3.getDate());
   t3.condition();
  }
}
	
	


	      


