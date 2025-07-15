package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
=======
=======
>>>>>>> 2c771ee (added curd template)
>>>>>>> 015c494 (added curd template)
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Customer;
import com.discover.service.CustomerService;

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
=======
>>>>>>> 2c771ee (added curd template)
import jakarta.websocket.server.PathParam;


@RestController
<<<<<<< HEAD
@RequestMapping("/api/customers")
=======
@RequestMapping("/customer")
<<<<<<< HEAD
>>>>>>> 015c494 (added curd template)
@Tag(name = "Customer API", description = "Operations related to customers")
@SecurityRequirement(name = "bearerAuth") // This applies JWT auth to all endpoints in this controller
public class CustomerController {
		
	@Autowired
	CustomerService customerService;
	
	
    // Helper method to get current authenticated user
    private String getCurrentUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null ? authentication.getName() : "anonymous";
    }
    
    
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
