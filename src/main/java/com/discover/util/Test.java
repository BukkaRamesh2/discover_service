package com.discover.util;

import com.discover.entity.Payments;
import java.util.Date;

public class Test {
	public static void main (String args[]) {
		Payments payment = new Payments(111, "card", "Processing", new Date());
		
		  Paymentprocess processing = new Paymentprocess(payment);

	        processing.checkstatus();
	        processing.completepayment();
	}

}
