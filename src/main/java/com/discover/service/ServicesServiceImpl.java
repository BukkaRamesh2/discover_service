package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Services;
import com.discover.repository.ServicesRepository;

@Service
public class ServicesServiceImpl implements ServicesService{
	
	@Autowired
	ServicesRepository servicesRepository;

	@Override
	public Services getService(Long serviceId) {
		// TODO Auto-generated method stub
		return servicesRepository.getById(serviceId);
	}

	@Override
	public Services addService(Services services) {
		// TODO Auto-generated method stub
		return servicesRepository.save(services);
	}

	@Override
	public Services updateService(Services services) {
		// TODO Auto-generated method stub
		return servicesRepository.save(services);
	}

	@Override
	public List<Services> getAllService() {
		// TODO Auto-generated method stub
		return servicesRepository.findAll();
	}
	
}
