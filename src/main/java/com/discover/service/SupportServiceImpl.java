package com.discover.service;

import com.discover.entity.Support;
import com.discover.exception.SupportNotFoundException;
import com.discover.repository.SupportRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class SupportServiceImpl implements SupportService {

    @Autowired
    private SupportRepository supportRepo;
    

    
    
    @Transactional
    @Override
    public Support save(Support support) {
    	if (support.getSupportId() != null ) {
            throw new SupportNotFoundException("No Support ID Found when creating");
        }
        return supportRepo.save(support);
    }
    
    @Transactional
    @Override
    public Support updateSupport(Support support) {
        if (support.getSupportId() == null ) {
            throw new SupportNotFoundException("ID required for update");
        }

        Support existing = supportRepo.findById(support.getSupportId())
            .orElseThrow(() -> new SupportNotFoundException("Support Id " + support.getSupportId() + " not found"));

        BeanUtils.copyProperties(support, existing, "id");
        return supportRepo.save(existing);
    }

    
    @Override
    public Support getById(Long supportId) {
        return supportRepo.findById(supportId)
        .orElseThrow(() -> new SupportNotFoundException("Support Id " + supportId + " not found"));
    }

    @Override
    public List<Support> getAllSupports() {
        return supportRepo.findAll();
    }

    @Override
    public void delete(Long supportId) {
    	 if (!supportRepo.existsById(supportId)) {
             throw new SupportNotFoundException("Support Id " + supportId + " not found");
         }
        supportRepo.deleteById(supportId);
    }
}
