package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discover.repository.PaymentsRepository;
import com.discover.entity.Payments;

public interface PaymentsService {

	public Payments addPayments(Payments payment); 

	public Payments getPayments(Long paymentid); 

	public List<Payments> getAllPayments();

	public Payments updatePayments(Payments payment);
	
	public void deletePayments(Long paymentid);


}
