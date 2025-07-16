package com.discover.service;

import java.util.List;

import com.discover.entity.Payments;

public interface PaymentsService {

	public Payments addPayments(Payments payment); //you can define method with body 

	public Payments getPayments(Long paymentid); //you can define method with body 

	public List<Payments> getAllPayments();

	public Payments updatePayments(Payments payment);
	
	public void deletePayments(Long paymentid);


}
