package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
=======
>>>>>>> 2c771ee (added curd template)
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

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
=======
>>>>>>> 2c771ee (added curd template)
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/customer")
<<<<<<< HEAD
@Tag(name = "Customer API", description = "Operations related to customers")
public class CustomerController {
		
	@Autowired
	CustomerService customerService;
	
	
//	public void test() { 
//		System.out.println("Home is called");
//	}
	
	@GetMapping("/getAllCustomers")
    @Operation(summary = "Get all customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/getCustomer/{customerID}")
    @Operation(summary = "Get customer by ID")
    public ResponseEntity<Customer> getCustomerById(@PathParam("customerID") Long id) {
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    @PostMapping("/addCustomer")
    @Operation(summary = "Create customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer saved = customerService.addCustomer(customer);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    
    @PutMapping("/updateCustomer")
    @Operation(summary = "Update customer")
    public ResponseEntity<Customer> update(@RequestBody Customer customer) {
        Customer updated = customerService.updateCustomer(customer);
        return ResponseEntity.ok(updated);
    }
    

    @DeleteMapping("/deleteCustomer/{customerID}")
    @Operation(summary = "Delete customer by ID")
    public ResponseEntity<Void> deleteCustomer(@PathParam("customerID") Long customerID) {
        customerService.deleteCustomer(customerID);
        return ResponseEntity.noContent().build();
    }
=======
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
	
	
>>>>>>> 2c771ee (added curd template)

}
