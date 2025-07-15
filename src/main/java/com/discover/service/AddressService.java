package com.discover.service;

import java.util.List;

import com.discover.entity.Address;

public interface AddressService {
	
	public Address addAddress(Address address);
	public Address getAddress(Long Id);
	public List<Address> getAllAddresss();
	public Address updateAddress(Address address);

}
