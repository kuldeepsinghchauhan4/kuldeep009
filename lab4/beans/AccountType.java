package com.capagemini.lab4.beans;

import com.capagemini.lab4.Exception.InsuffiecientBalanceException;
import com.capagemini.lab4.Exception.InvailidAccountNumberException;

public class AccountType {
	
	private String accountType;

	public AccountType(String accountType) {
		super();
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "AccountType [accountType=" + accountType + "]";
	}
	
	public String withdraw(long accountNumber, double balanceToWithdraw) throws InsuffiecientBalanceException, InvailidAccountNumberException {
		return accountType;
		
	}
	
}
