package com.cg.customer.bean;

public class Customer {
	String name;
	String mobno;
	Wallet wallet;
	
	public String getName() {
		return name;
	}

	
	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name= name2;
	}
}
