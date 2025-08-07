package com.discover.controller;

import com.discover.entity.Services;
import com.discover.service.ServicesService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
@Tag(name = "Services", description = "Endpoints for managing service records")
public class ServicesController {

    @Autowired
    private ServicesService serviceLayer;

    @Operation(
        summary = "Get a service by ID",
        description = "Retrieve detailed information about a service using its unique ID"
    )
    @GetMapping("/{id}")
    public Services fetchServiceById(@PathVariable("id") Long id) {
        return serviceLayer.getService(id);
    }

    @Operation(
        summary = "Get all services",
        description = "Fetch a list of all services from the system"
    )
    @GetMapping
    public List<Services> fetchAllServices() {
        return serviceLayer.getAllService();
    }

    @Operation(
        summary = "Create a new service",
        description = "Add a new service record to the system"
    )
    @PostMapping
    public Services createService(@RequestBody Services service) {
        return serviceLayer.addService(service);
    }

    @Operation(
        summary = "Update an existing service",
        description = "Make changes to an existing service record"
    )
    @PutMapping
    public Services modifyService(@RequestBody Services service) {
        return serviceLayer.updateService(service);
    }

    @Operation(
        summary = "Delete a service",
        description = "Remove a service record by its ID"
    )
    @DeleteMapping("/{id}")
    public void removeService(@PathVariable("id") Long id) {
        serviceLayer.deleteService(id);
    }
}
