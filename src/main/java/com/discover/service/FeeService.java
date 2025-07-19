package com.discover.service;

import com.discover.entity.Fee;
import java.util.List;
import java.util.Optional;

public interface FeeService {

    Fee addFee(Fee fee);

    Optional<Fee> getFeeById(String feeId);

    List<Fee> getAllFees();

    Fee updateFee(Fee fee);

    void deleteFee(String feeId);
}
