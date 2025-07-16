package com.discover.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Account;
import com.discover.service.AccountService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/Account")
public class AccountController {
	
	
	@Autowired
	AccountService AccService;
	
	
	@PostMapping("/AddAccount")
	public Account addAccount(@RequestBody Account account ) {
		return AccService.addAccount(account);
	}
	
	@GetMapping("/getAccount/{accountId}")
	public Account getAccount(@PathParam("accountId") Long accountId) {
		return AccService.getAccount(accountId);
	}
	
	@GetMapping("/getAllAccounts")
	public java.util.List<Account> getAllAccounts() {
		return AccService.getAllAccounts();
	}
	
	@PutMapping("/updateAccount")
	public Account updateAccount(@RequestBody Account account) {
		return AccService.updateAccount(account);
	}
	
	public void deleteAccount(Long Id) {
	    AccService.deleteById(Id);
	}


}
