package com.discover.service;

import com.discover.entity.Fee;
import com.discover.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeeServiceImpl implements FeeService {

    @Autowired
    FeeRepository feeRepository;

    @Override
    public Fee addFee(Fee fee) {
        return feeRepository.save(fee);
    }

    @Override
    public Optional<Fee> getFeeById(String feeId) {
        return feeRepository.findById(feeId);
    }

    @Override
    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }

    @Override
    public Fee updateFee(Fee fee) {
        return feeRepository.save(fee);
    }

    @Override
    public void deleteFee(String feeId) {
        feeRepository.deleteById(feeId);
    }
}
