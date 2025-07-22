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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("services")
@Tag(name = "Services API", description = "Operations related to services")
public class ServicesController {
	
	@Autowired
	ServicesService servicesservice;
	
	@GetMapping("getService/{serviceId}")
	@Operation(summary = "Get service by serviceId")
	public Services getService(@PathVariable("ServiceId") Long serviceId) {
		return servicesservice.getService(serviceId);
	}
	
	@GetMapping("getAllService")
	@Operation(summary = "Get all services")
	public List<Services> getAllService() {
		return servicesservice.getAllService();
	}
	
	@PostMapping("addService")
	@Operation(summary = "Add service")
	public Services addService(@RequestBody Services services) {
		return servicesservice.addService(services);
	}
	
	@PutMapping("updateService")
	@Operation(summary = "update service")
	public Services updateService(@RequestBody Services services) {
		return servicesservice.updateService(services);
	}
	
	@DeleteMapping("deleteService/{serviceId}")
	@Operation(summary = "Delete service")
	public void deleteService(@PathVariable("ServiceId") Long serviceId) {
		servicesservice.deleteService(serviceId);
	}
}
