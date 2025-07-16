package com.discover.service;

import java.util.List;
import com.discover.entity.Account;

public interface AccountService {

    public Account addAccount(Account account); // you can define method with body if using default or static

    public Account getAccount(Long accountId);

	public java.util.List<Account> getAllAccounts();

	public Account updateAccount(Account account);

	public void deleteById(Long id);
	

	

	
}
