package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Address;
import com.discover.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressRepository addrRepo;

	@Override
	public Address addAddress(Address address) {
		
		return addrRepo.save(address);
	}

	@Override
	public Address getAddress(Long Id) {
		// TODO Auto-generated method stub
		return addrRepo.getById(Id);
	}

	@Override
	public List<Address> getAllAddresss() {
		return addrRepo.findAll();
	}

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return addrRepo.save(address);
	}

	

}
