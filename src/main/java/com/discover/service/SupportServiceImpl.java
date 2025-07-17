package com.discover.service;

import com.discover.entity.Support;
import com.discover.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupportServiceImpl implements SupportService {

    @Autowired
    private SupportRepository supportRepo;

    @Override
    public Support save(Support support) {
        return supportRepo.save(support);
    }


    @Override
    public Support getById(Long supportId) {
        Optional<Support> byId = supportRepo.findById(supportId);
        if(byId.isPresent()){
            return byId.get();
        }
         return null;
    }

    @Override
    public List<Support> getAllSupports() {
        return supportRepo.findAll();
    }

    @Override
    public void delete(Long supportId) {
        supportRepo.deleteById(supportId);
    }
}
