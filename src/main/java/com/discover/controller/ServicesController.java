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

import com.discover.entity.Services;
import com.discover.service.ServicesService;

@RestController
@RequestMapping("services")
public class ServicesController {
	
	@Autowired
	ServicesService servicesservice;
	
	@GetMapping("getService/{serviceId}")
	public Services getService(@PathVariable("ServiceId") Long serviceId) {
		return servicesservice.getService(serviceId);
	}
	
	@GetMapping("getAllService")
	public List<Services> getAllService() {
		return servicesservice.getAllService();
	}
	
	@PostMapping("addService")
	public Services addService(@RequestBody Services services) {
		return servicesservice.addService(services);
	}
	
	@PutMapping("updateService")
	public Services updateService(@RequestBody Services services) {
		return servicesservice.updateService(services);
	}
	
	@DeleteMapping("deleteService/{serviceId")
	public void deleteService(@PathVariable("ServiceId") Long serviceId) {
		
	}
}
