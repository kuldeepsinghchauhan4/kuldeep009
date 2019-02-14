package com.capagemini.lab4.beans;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	private AccountType accountType;
	
	public Account(long accNum, double balance, Person accHolder, AccountType accountType) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
		this.accountType = accountType;
	}
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + ", accountType="
				+ accountType + "]";
	}

	
	
}
