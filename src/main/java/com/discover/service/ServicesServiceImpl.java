package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.discover.entity.Customer;
import com.discover.entity.Services;
import com.discover.exception.CustomerNotFoundException;
import com.discover.exception.ServicesNotFoundException;
import com.discover.repository.ServicesRepository;

@Service
public class ServicesServiceImpl implements ServicesService{
	
	@Autowired
	ServicesRepository servicesRepository;

	@Transactional
	@Override
	public Services getService(Long serviceId) {
		// TODO Auto-generated method stub
		return servicesRepository.findById(serviceId).orElseThrow(() -> new ServicesNotFoundException("ServiceId " + serviceId + "not found"));
	}

	@Transactional
	@Override
	public Services addService(Services services) {
		// TODO Auto-generated method stub
		if (services.getServiceId() != null) {
            throw new IllegalArgumentException("No ID allowed when creating");
        }
		return servicesRepository.save(services);
	}

	@Transactional
	@Override
	public Services updateService(Services services) {
		// TODO Auto-generated method stub
		if (services.getServiceId() == null) {
            throw new IllegalArgumentException("ID required for update");
        }

        Services existing = servicesRepository.findById(services.getServiceId())
            .orElseThrow(() -> new ServicesNotFoundException("Service Id " + services.getServiceId() + " not found"));


        BeanUtils.copyProperties(services, existing, "id");
		return servicesRepository.save(existing);
	}

	@Transactional
	@Override
	public List<Services> getAllService() {
		// TODO Auto-generated method stub
		return servicesRepository.findAll();
	}

	@Transactional
	@Override
	public void deleteService(Long serviceId) {
		// TODO Auto-generated method stub
		if(!servicesRepository.existsById(serviceId)) {
			throw new ServicesNotFoundException("ServiceId " + serviceId + "not found");
		}
		servicesRepository.deleteById(serviceId);
	}
	
}
