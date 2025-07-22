package com.discover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discover.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
//	public Customer findByFirstName(String firstName);
	
}
