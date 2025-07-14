package com.discover.entity;

import java.util.Date;

public class Payments {
	private int paymentid;
	private String paymentmode;
	private String status;
	private Date paymentdate;
	
	public Payments(int paymentid, String paymentmode, String status, Date paymentdate ) {
		this.setPaymentid(paymentid);
		this.setPaymentmode(paymentmode);
		this.setPaymentdate(paymentdate);
		this.setStatus(status);
		
	}

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	
}
