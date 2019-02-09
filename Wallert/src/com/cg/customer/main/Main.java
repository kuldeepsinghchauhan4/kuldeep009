package com.cg.customer.main;

import java.util.Scanner;

import com.cg.customer.bean.Customer;
import com.cg.customer.bean.Wallet;
import com.cg.customer.repo.CustomerDetImp;
import com.cg.customer.service.CustomerImp;
public class Main {

	public static void main(String[] args) {
		Customer c=new Customer();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		
		c.setName(s.next());
		System.out.println("enter ur mobno");
		c.setMobno(s.next());
		Wallet w=new Wallet();
		System.out.println("enter amt");
		w.setBal(s.nextDouble());
		w.setId(s.next());
		c.setWallet(w);
		/* CustomerImp c2=new  CustomerImp ();
		 c2.createAccount(name, mobno, bal);*/
		CustomerDetImp c1=new CustomerDetImp();
		if(c1.save(c)){
		System.out.println("hi");	
		}
		c1.findByPhone("7500800149");
	}

}
