package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.discover.entity.Account;
import com.discover.repository.AccountRepository;

@Service
public abstract class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository AccountRepo;

    @Override
    public Account addAccount(Account account) {
        // TODO: Add logic to save account (via repository)
        return AccountRepo.save(account);
    }

    @Override
    public Account getAccount(Long id) {
        // TODO: Add logic to fetch account by ID
        return AccountRepo.getById(id);
    }

	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return AccountRepo.findAll();
	}

	@Override
	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		return AccountRepo.save(account);
	}
	public void deleteAccount(Long Id) {
	    AccountRepo.deleteById(Id);
	}

}
