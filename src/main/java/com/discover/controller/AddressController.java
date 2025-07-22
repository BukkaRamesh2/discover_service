package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Address;
import com.discover.service.AddressService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/address")
@Tag(name = "Address API", description = "Operations related to address")
public class AddressController {
	
	
	
	@Autowired
	AddressService addrService;
	
	@GetMapping("/getAllAddress")
	@Operation(summary = "Get all addresses")
	public List<Address> getAllAddresss()
	{
		return addrService.getAllAddresss();
	}
	
	@GetMapping("/getAddress/{addressID}")
	@Operation(summary = "Get address by ID")
	public ResponseEntity<Address> getAddressById(@PathParam("addressID") Long addressID)
	{
		Address addr=addrService.getAddress(addressID);
		return ResponseEntity.ok(addr);
	}
	
	@PostMapping("/addAddress")
	
	@Operation(summary = "Create Address")
	public ResponseEntity<Address> addAddress(@RequestBody Address address)
	{
		Address saved = addrService.addAddress(address);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);
	}
	
	
	
	
	
	@PutMapping("/updateAddress")
	@Operation(summary = "Update address")
	public ResponseEntity<Address> updateAddress(@RequestBody Address address)
	{
		
		Address updated= addrService.updateAddress(address);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/deleteAddress/{addressID}")
	@Operation(summary = "Delete address by ID")
	public ResponseEntity<Void> deleteAddress(@PathParam("addressID") Long addressID)
	
	{
		addrService.deleteAddress(addressID);
        return ResponseEntity.noContent().build();
	}
	

}
