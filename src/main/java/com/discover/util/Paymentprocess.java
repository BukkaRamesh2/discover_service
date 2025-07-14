package com.discover.util;

import com.discover.entity.Payments;

public class Paymentprocess extends Paymentoperation{

	public Paymentprocess(Payments payment) {
		super(payment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkstatus() {
		if (payment.getStatus().equalsIgnoreCase("Completed")) {
			System.out.println("Payment is Done");
		}
		else if (payment.getStatus().equalsIgnoreCase("Processing") || payment.getStatus().equals(null)){
			System.out.println("Payment is still Processing");
		}
		else {
			System.out.println("Payment is still Processing");
		}
		
	}

	@Override
	public void completepayment() {
		if (payment.getStatus() == "Completed")  {
			System.out.println("Payment is Completed");
		}
		else {
			System.out.println(" ");
		}
		
		
		/*if 	(payment.getStatus() == "Completed") {
			System.out.println("Payment is Completed");
		}
		else if (payment.getStatus() == "Processing" || payment.getStatus() == null) {
			System.out.println("Payment is Processing");
		}
		else {
			System.out.println("Payment is Processing");
		}*/
		
	}
	
	public void displayinfo() {
		System.out.println("Payment Details" );
		System.out.println("Paymentid  :- "+payment.getPaymentid());
		System.out.println("Payment Mode :- "+payment.getPaymentmode());
		System.out.println("Payment Status :- "+payment.getStatus());
		System.out.println("Date :- "+payment.getPaymentdate());
		
		}
}