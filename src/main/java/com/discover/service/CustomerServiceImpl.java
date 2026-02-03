package com.discover.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Customer;
import com.discover.exception.CustomerNotFoundException;
import com.discover.repository.CustomerRepository;
import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	private final Map<Long, Customer> customerStore =  new HashMap();
	
	
	@Autowired
	CustomerRepository customerRepository;

	
	@Transactional
    @Override
    public Customer addCustomer(Customer customer) {
        if (customer.getCustomerID() != null || customer.getVersion() != null) {
            throw new IllegalArgumentException("No ID/version allowed when creating");
        }
        return customerRepository.save(customer);
    }

    @Transactional
    @Override
    public Customer updateCustomer(Customer customer) {
        if (customer.getCustomerID() == null || customer.getVersion() == null) {
            throw new IllegalArgumentException("ID and version required for update");
        }

        Customer existing = customerRepository.findById(customer.getCustomerID())
            .orElseThrow(() -> new CustomerNotFoundException("Customer Id " + customer.getCustomerID() + " not found"));

        if (!existing.getVersion().equals(customer.getVersion())) {
            throw new ObjectOptimisticLockingFailureException(Customer.class, customer.getCustomerID());
        }

        BeanUtils.copyProperties(customer, existing, "id", "version");
        return customerRepository.save(existing);
    }
	
	
    @Override
    public Customer getCustomerById(Long id) {
            return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer Id " + id + " not found"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(Long id) {
        if (!customerRepository.existsById(id)) {
            throw new CustomerNotFoundException("Customer Id " + id + " not found");
        }
        customerRepository.deleteById(id);
    }

	

}