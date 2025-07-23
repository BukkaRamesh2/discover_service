package com.discover.service;

import com.discover.entity.Fee;
import java.util.List;

public interface FeeService {

    Fee addFee(Fee fee);

    Fee getFeeById(String feeId);

    List<Fee> getAllFees();

    Fee updateFee(Fee fee);

    void deleteFee(String feeId);
}
