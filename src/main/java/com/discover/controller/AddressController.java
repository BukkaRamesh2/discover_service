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

import com.discover.entity.Address;
import com.discover.service.AddressService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	
	@Autowired
	AddressService addrService;
	
	
	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address)
	{
		return addrService.addAddress(address);
		
	}
	
	@GetMapping("/getAddress/{addressID}")
	public Address getAddress(@PathParam("addressID") Long addressID)
	{
		return addrService.getAddress(addressID);
	}
	
	@GetMapping("/getAllAddress")
	public List<Address> getAllAddresss()
	{
		return addrService.getAllAddresss();
	}
	
	@PutMapping("/updateAddress")
	public Address updateAddress(@RequestBody Address address)
	{
		return addrService.updateAddress(address);
	}
	
	@DeleteMapping("/deleteAddress/{addressID}")
	public void deleteAddress(@PathParam("addressID") Long addressID)
	{
		
	}
	

}
