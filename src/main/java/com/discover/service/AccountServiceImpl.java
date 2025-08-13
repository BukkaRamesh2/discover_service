package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Account;
import com.discover.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepo;

    @Override
    public Account addAccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepo.findById(id).orElse(null);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public void deleteById(Long accountId) {
        accountRepo.deleteById(accountId);
    }
}
