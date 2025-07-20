package com.discover.service;

import java.util.List;

import com.discover.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer); //you can define method with body 

	public Customer getCustomer(Long Id); //you can define method with body 
	
	public List<Customer> getAllCustomers();
	
	public Customer updateCustomer(Customer customer);

}
