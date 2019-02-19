package com.cg.ems.ui;

import java.util.ArrayList;

import com.cg.ems.dto.Employ;
import com.cg.ems.service.EmployServiceImpl;

public class TestEmpJpa {
	static EmployServiceImpl empSer=new 	EmployServiceImpl();
	
	public static void main(String arg[]) {
		
		/*Employ e1=new Employ(446,"sunny singh",4600.0F,null);
		Employ e2=new Employ(556,"bobby singh",4700.0F,null);*/
	/*	Employ e1=new Employ();
		e1.setEmpName("aaa");
		e1.setEmpSal(8000.0F);*/
/*	
Employ ee1=empSer.addEmp(e1);
//Employ ee2=empSer.addEmp(e2);
System.out.println(ee1);*/
	Employ ee=empSer.getEmpbyId(555);
		System.out.println(ee);
		System.out.println("fetch all records");
		ArrayList<Employ> eList=empSer.fetchAllEmp();
		for(Employ tempE:eList) {
			System.out.println(tempE.getEmpId()+"\t"+tempE.getEmpName()+"\t"+tempE.getEmpSal());
		}
		System.out.println("delete");
		Employ ee1=empSer.deleteEmpEid(555);
		System.out.println(ee1+"deleted ");
		
		System.out.println("update");
		Employ updatedE=empSer.updateEmp(222, "ram", 90000.0F);
		System.out.println("upadted data for"+updatedE.getEmpId());
}
}