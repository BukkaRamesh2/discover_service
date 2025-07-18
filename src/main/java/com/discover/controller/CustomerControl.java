package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.discover.entity.Services;
import com.discover.service.ServicesService;

@RestController
@RequestMapping("/services")
public class ServicesController {

    @Autowired
    private ServicesService serviceLayer;

    // Fetch a single service by ID
    @GetMapping("/{id}")
    public Services fetchServiceById(@PathVariable("id") Long id) {
        return serviceLayer.getService(id);
    }

    // Fetch all services
    @GetMapping
    public List<Services> fetchAllServices() {
        return serviceLayer.getAllService();
    }

    // Add a new service
    @PostMapping
    public Services createService(@RequestBody Services service) {
        return serviceLayer.addService(service);
    }

    // Update an existing service
    @PutMapping
    public Services modifyService(@RequestBody Services service) {
        return serviceLayer.updateService(service);
    }

    // Delete a service by ID
    @DeleteMapping("/{id}")
    public void removeService(@PathVariable("id") Long id) {
        serviceLayer.deleteService(id);
    }

}
