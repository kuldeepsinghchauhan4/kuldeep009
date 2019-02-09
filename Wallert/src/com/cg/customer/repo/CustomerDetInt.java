package com.cg.customer.repo;
import com.cg.customer.bean.*;
public interface CustomerDetInt {
	 public boolean save(Customer c);
public 	Customer findByPhone(String mobno);
}
