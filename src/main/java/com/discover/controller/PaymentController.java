package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Payments;
import com.discover.service.PaymentsService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	
	@Autowired
	private PaymentsService paymentService;
	
	
	@PostMapping("/addPayment")
	public Payments addPayment(@RequestBody Payments payment){
		return paymentService.addPayments(payment);
		
	}
	
	@GetMapping("/getCustomer/{customerID}")
	public Payments getPayment(@PathParam("paymentid") Long paymentid){
		return paymentService.getPayments(paymentid);
	}
	
	@GetMapping("/getAllPayments")
	public List<Payments> getAllPayments(){
		return paymentService.getAllPayments();
	}
	
	@PutMapping("/updatePayments")
	public Payments updatePaymnets(@RequestBody Payments payment){
		return paymentService.updatePayments(payment);
	}
	
	@DeleteMapping("/deletePayments/{paymentid}")
	public void deletePayments(@PathParam("paymentid") Long paymentid){
		paymentService.deletePayments(paymentid);
		
	}
	
	


}
