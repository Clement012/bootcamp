package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit; 
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {  // throw exception?
		// complete the function
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) { 
		// complete the function
		 this.balance += amount;
		// BigDecimal <--todo
	//	 BigDecimal amountToAdd = BigDecimal.valueOf(amount);
	//	 BigDecimal currentAmount = BigDecimal.valueOf(this.balance);
	//	 BigDecimal NewAmount = amountToAdd.add(currentAmount);
	//	 this.balance = NewAmount.doubleValue();
	}

	public boolean debitAccount(double amount) { //?
		// complete the function
		if (amount <= balance){
			this.balance -= amount;
			return true;
		} else {
		return false;
  	}
  }
}
