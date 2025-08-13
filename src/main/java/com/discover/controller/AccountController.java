package com.discover.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/Account")
@Tag(name = "Rewards API", description = "Operations related to rewards")
public class AccountController {
	
	
	@Autowired
	AccountService AccService;
	
	
	@PostMapping("/AddAccount")
	public Account addAccount(@RequestBody Account account ) {
		return AccService.addAccount(account);
	}
	
	@GetMapping("/getAccount/{accountId}")
	public Account getAccount(@PathVariable("accountId") Long accountId) {
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
	@DeleteMapping("/deleteAccount/{accountId}")
	public void deleteAccount(@PathVariable("accountId") Long accountId) {
	    AccService.deleteById(accountId);
	}

	
}
