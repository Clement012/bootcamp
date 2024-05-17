package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<>();
		}
	

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		 Long accountNumber = (long) accounts.size();
		 CommercialAccount c = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		 accounts.put(accountNumber, c );
		 return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		 Long accountNumber = (long) accounts.size();
		 ConsumerAccount c = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		 accounts.put(accountNumber, c);
		 return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin)  {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null){
		return account.validatePin(pin);
		} else {
			return false;
		}
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null){
			return account.getBalance();
		} else {
			return 0.0;
		}
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null){
			account.creditAccount(amount);
		} 
		 
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
//		Account account = accounts.get(accountNumber);
//		if (account != null){
//		  account.debitAccount(amount);
 //     } return true;
    return accounts.get(accountNumber).debitAccount(amount);
  }
	
}
