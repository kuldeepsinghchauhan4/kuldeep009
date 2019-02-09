package com.cg.customer.repo;
import java.util.ArrayList;

import com.cg.customer.bean.*;
import com.cg.customer.service.*;
public class CustomerDetImp implements CustomerDetInt{
	
	
	
	
	ArrayList<Customer> l=new ArrayList<Customer>();
	
	
	@Override
	public boolean save(Customer c) {
		l.add(c);
		System.out.println("hi1");
		return true;
		
		
		
	}
@Override
public  Customer findByPhone(String mobno) {

	Customer temp=null;
	for(Customer c:l) {
	if(Long.parseLong(c.getMobno())==Long.parseLong(mobno)) {
		temp=c;

	}
	
}
	System.out.println(temp.getMobno()+""+temp.getName());
return temp;
}}

