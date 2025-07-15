package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Customer;
import com.discover.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository custRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		// anthing 
		return custRepo.save(customer);
	}

	@Override
	public Customer getCustomer(Long Id) {
		// TODO Auto-generated method stub
		return custRepo.getById(Id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custRepo.save(customer);
	}

	

}
