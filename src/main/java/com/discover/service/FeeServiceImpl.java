package com.discover.service;

import com.discover.entity.Fee;
import com.discover.exception.FeeNotFoundException; 
import com.discover.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional; 

import java.util.List;


@Service
public class FeeServiceImpl implements FeeService {

    @Autowired
    FeeRepository feeRepository;

    @Override
    @Transactional 
    public Fee addFee(Fee fee) {
        return feeRepository.save(fee);
    }

    @Override
    public Fee getFeeById(String feeId) {
        
        return feeRepository.findById(feeId)
                .orElseThrow(() -> new FeeNotFoundException("Fee not found with ID: " + feeId));
    }

    @Override
    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }

    @Override
    @Transactional 
    public Fee updateFee(Fee fee) {
       
        if (!feeRepository.existsById(fee.getFeeId())) {
            throw new FeeNotFoundException("Cannot update. Fee not found with ID: " + fee.getFeeId());
        }
        return feeRepository.save(fee);
    }

    @Override
    public void deleteFee(String feeId) {
        
        if (!feeRepository.existsById(feeId)) {
            throw new FeeNotFoundException("Cannot delete. Fee not found with ID: " + feeId);
        }
        feeRepository.deleteById(feeId);
    }
}
