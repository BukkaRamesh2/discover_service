package com.discover.controller;

import com.discover.entity.Fee;
import com.discover.service.FeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fee")
public class FeeController {

    @Autowired
    FeeService feeService;

    @PostMapping("/addFee")
    public Fee addFee(@RequestBody Fee fee) {
        return feeService.addFee(fee);
    }

    @GetMapping("/getFee/{feeId}")
    public Fee getFeeById(@PathParam("feeId") String feeId) {
        return feeService.getFeeById(feeId).orElse(null);
    }

    @GetMapping("/getAllFees")
    public List<Fee> getAllFees() {
        return feeService.getAllFees();
    }

    @PutMapping("/updateFee")
    public Fee updateFee(@RequestBody Fee fee) {
        return feeService.updateFee(fee); 
    }

    @DeleteMapping("/deleteFee/{feeId}")
    public void deleteFee(@PathParam("feeId") String feeId) {
    }
}
