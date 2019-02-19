package com.cg.ems.ui;

import com.cg.ems.dto.Employ;
import com.cg.ems.service.EmployServiceImpl;

public class TestEmpJpa {
	static EmployServiceImpl empSer=new 	EmployServiceImpl();
	
	public static void main(String arg[]) {
		
		Employ e1=new Employ(446,"sunny singh",4600.0F,null);
		Employ e2=new Employ(556,"bobby singh",4700.0F,null);
	
Employ ee1=empSer.addEmp(e1);
Employ ee2=empSer.addEmp(e2);
System.out.println(ee1+"\n"+ee2);
}
}