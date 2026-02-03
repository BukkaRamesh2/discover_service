package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Branch;
import com.discover.exception.BranchNotFoundException;
import com.discover.exception.CustomerNotFoundException;
import com.discover.repository.BranchRepository;

import jakarta.transaction.Transactional;

@Service
public class BranchServiceImpl implements BranchService{
	
	@Autowired
	BranchRepository brhRepo;
	
	@Transactional
	@Override
	public Branch addBranch(Branch brh)
	{
		if (brh.getBranchId() != null || brh.getVersion() != null) {
            throw new IllegalArgumentException("No ID/version allowed when creating");
        }
		return brhRepo.save(brh);
	}
	
	
	@Transactional
	@Override
	public Branch updateBranch(Branch brh)
	{
		if (brh.getBranchId() == null || brh.getVersion() == null) {
            throw new IllegalArgumentException("ID and version required for update");
        }

        Branch existing = brhRepo.findById(brh.getBranchId())
            .orElseThrow(() -> new CustomerNotFoundException("Branch Id " + brh.getBranchId() + " not found"));

        if (!existing.getVersion().equals(brh.getVersion())) {
            throw new ObjectOptimisticLockingFailureException(Branch.class, brh.getBranchId());
        }

        BeanUtils.copyProperties(brh, existing, "id", "version");
		return brhRepo.save(existing);
	}
	
	@Override
	public Branch getBranch(Long Id)
	{
		return brhRepo.findById(Id)
				.orElseThrow(() -> new BranchNotFoundException("Branch Id " + Id + " not found"));
	}

	@Override
	public List<Branch> getAllBranches()
	{
		return brhRepo.findAll();
	}
	
	@Override
	public void deleteBranch(Long Id) {
		if (!brhRepo.existsById(Id)) {
            throw new BranchNotFoundException("Branch Id " + Id + " not found");
        }
        brhRepo.deleteById(Id);
		
	}

}
