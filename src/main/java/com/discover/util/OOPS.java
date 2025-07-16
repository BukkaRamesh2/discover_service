package com.discover.util;
import java.time.LocalDate;
import com.discover.entity.Transaction;
public class OOPS extends Transaction implements Transaction.Transdetails
{

	public String  transactionstatus;
	
	public String  gettransactionstatus() 
	{
		return transactionstatus; 
	}
	public void setTransactionstatus(String transactionstatus) 
	{
		 this.transactionstatus = transactionstatus;
	 }
	public OOPS(String  transactionstatus)
	{
		this.transactionstatus=transactionstatus;
	}
	public void Trans()
	{
		System.out.println("The old transaction details overriding with new Transaction details");
	}
	
	public void secretdata()   //interface method
	{
		System.out.println("Token secret");
	}
	 
	public static void main (String[] args)
	{
		OOPS c= new OOPS("Pass");
		c.Trans(); //method from parent class ,overridden
		System.out.println("The transaction details: " + c.gettransactionstatus());
		Transaction t2 =new Transaction();     //method 
		t2.Trans(200L,"saving");
		System.out.println("Trans ID: "+ t2.getTransactionId());
		System.out.println("Type: " + t2.getTransactionType());
		Transaction t3 =new Transaction();    //method
		t3.Trans(200L,2000,LocalDate.of(2025, 7, 13));
	    System.out.println("Trans ID: "+ t3.getTransactionId());
		System.out.println("Amount: " + t3.getAmount());
		System.out.println("Date: " + t3.getDate());
		
	t3.condition();
	t3.amountcondition();
 }
}




