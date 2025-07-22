package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Address;
import com.discover.exception.AddressNotFoundException;

import com.discover.repository.AddressRepository;

import jakarta.transaction.Transactional;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressRepository addrRepo;

	@Transactional
	@Override
	public Address addAddress(Address address) {
		
		if (address.getAddressId() != null || address.getVersion() != null) {
            throw new IllegalArgumentException("No ID/version allowed when creating");
        }
		return addrRepo.save(address);
	}

	
	@Transactional
	@Override
	public Address getAddress(Long Id) {
		return addrRepo.findById(Id)
                .orElseThrow(() -> new AddressNotFoundException("Address Id " + Id + " not found"));
	}

	

	@Override
	public Address updateAddress(Address address) {
		if (address.getAddressId() == null || address.getVersion() == null) {
            throw new IllegalArgumentException("ID and version required for update");
        }

        Address existing = addrRepo.findById(address.getAddressId())
            .orElseThrow(() -> new AddressNotFoundException("Address Id " + address.getAddressId() + " not found"));

        if (!existing.getVersion().equals(address.getVersion())) {
            throw new ObjectOptimisticLockingFailureException(Address.class, address.getAddressId());
        }

        BeanUtils.copyProperties(address, existing, "id", "version");
        return addrRepo.save(existing);
	}

	
	@Override
	public List<Address> getAllAddresss() {
		return addrRepo.findAll();
	}
	
	@Override
    public void deleteAddress(Long id) {
        if (!addrRepo.existsById(id)) {
            throw new AddressNotFoundException("Address Id " + id + " not found");
        }
        addrRepo.deleteById(id);
    }
	

}
