package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Payments;
import com.discover.repository.PaymentsRepository;

@Service
public class PaymentsServiceImpl implements PaymentsService {
	
	@Autowired
	PaymentsRepository payment;

	
	
	public Payments addPayments(Payments payment) {
		// TODO Auto-generated method stub
		return null;
	}

	public Payments getPayments(Long paymentid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Payments> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	public Payments updatePayments(Payments payment) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePayments(Long paymentid) {
		// TODO Auto-generated method stub
		
	}

}
