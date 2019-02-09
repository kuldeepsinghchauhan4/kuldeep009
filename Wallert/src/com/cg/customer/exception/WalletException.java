package com.cg.customer.exception;

import com.cg.customer.service.CustomerImp;

public class WalletException {
public static void main(String arg[]) {
	CustomerImp c=new CustomerImp();
	try {
	c.showBal("8439");
	
}catch(Exception e) {
	System.out.println("exception has been handled");
}
}
}
