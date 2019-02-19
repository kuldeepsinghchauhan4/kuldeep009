package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dto.Employ;

public interface EmployService {
	
		public Employ addEmp(Employ emp);
		public ArrayList<Employ> fetchAllEmp();
		public Employ deleteEmpEid(int empId);
		public Employ getEmpbyId(int empId);
		public Employ updateEmp(int empId,String newname,float newSal);


}
