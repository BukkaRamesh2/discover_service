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

import com.discover.entity.Customer;
import com.discover.service.CustomerService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	
	@Autowired
	CustomerService custService;
	
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer){
		return custService.addCustomer(customer);
		
	}
	
	@GetMapping("/getCustomer/{customerID}")
	public Customer getCustomer(@PathParam("customerID") Long customerID){
		return custService.getCustomer(customerID);
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers(){
		return custService.getAllCustomers();
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer){
		return custService.updateCustomer(customer);
	}
	
	@DeleteMapping("/deleteCustomer/{customerID}")
	public void deleteCustomer(@PathParam("customerID") Long customerID){
		
	}
	
	

}
