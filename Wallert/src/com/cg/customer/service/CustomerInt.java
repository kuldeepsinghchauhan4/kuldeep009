package com.cg.customer.service;
import com.cg.customer.bean.*;
public  interface customerInt  {
	Customer createAccount(String name,String mobno,double bal);
	Customer showBal(String mobno);
}
