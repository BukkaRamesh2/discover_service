package com.discover.util;

import com.discover.entity.Payments;

public abstract class Paymentoperation{
	protected Payments payment;
	public Paymentoperation(Payments payment) {
		this.payment=payment;
	}
	
	public abstract void checkstatus();
	public abstract void completepayment();
		
}
