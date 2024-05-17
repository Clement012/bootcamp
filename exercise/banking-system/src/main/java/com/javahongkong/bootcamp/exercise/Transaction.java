package com.javahongkong.bootcamp.exercise;

public class Transaction {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		
		this.bank = bank;
		this.accountNumber = accountNumber;
		if (!bank.getAccount(accountNumber).validatePin(attemptedPin)) {
			throw new Exception();
	  }
	}

	public double getBalance() {
		return this.bank.getBalance(accountNumber);
		// complete the function
	}

	public void credit(double amount) {
		// complete the function
		this.bank.credit(accountNumber,amount);  
	}

	public boolean debit(double amount) {
		// complete the function
		return this.bank.debit(accountNumber,amount);
	}
}
