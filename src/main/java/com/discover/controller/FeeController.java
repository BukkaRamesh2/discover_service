package com.discover.controller;

import com.discover.entity.Fee;
import com.discover.service.FeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fees") // 
@Tag(name = "Fee API", description = "API for fees") 
@SecurityRequirement(name = "bearerAuth") 
public class FeeController {

    @Autowired
    FeeService feeService;

    @Operation(summary = "Add a new fee")
    @PostMapping("/addFee")
    public ResponseEntity<Fee> addFee(@RequestBody Fee fee) {
        Fee newFee = feeService.addFee(fee);
        return new ResponseEntity<>(newFee, HttpStatus.CREATED);
    }

    @Operation(summary = "Get a fee by its ID")
    @GetMapping("/getFee/{feeId}")
    public ResponseEntity<Fee> getFeeById(@PathVariable String feeId) {
        Fee fee = feeService.getFeeById(feeId);
        return new ResponseEntity<>(fee, HttpStatus.OK);
    }

    @Operation(summary = "Get all fees")
    @GetMapping("/getAllFees")
    public ResponseEntity<List<Fee>> getAllFees() {
        List<Fee> fees = feeService.getAllFees();
        return new ResponseEntity<>(fees, HttpStatus.OK);
    }

    @Operation(summary = "Update an existing fee")
    @PutMapping("/updateFee")
    public ResponseEntity<Fee> updateFee(@RequestBody Fee fee) {
        Fee updatedFee = feeService.updateFee(fee);
        return new ResponseEntity<>(updatedFee, HttpStatus.OK);
    }

    @Operation(summary = "Delete a fee by its ID")
    @DeleteMapping("/deleteFee/{feeId}")
    public ResponseEntity<String> deleteFee(@PathVariable String feeId) {
        feeService.deleteFee(feeId); 
        return new ResponseEntity<>("Fee with ID " + feeId + " was deleted successfully.", HttpStatus.OK);
    }
}
