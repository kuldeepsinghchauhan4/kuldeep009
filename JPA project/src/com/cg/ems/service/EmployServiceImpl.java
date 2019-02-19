package com.cg.ems.service;
import java.util.ArrayList;

import com.cg.ems.dao.*;
import com.cg.ems.dto.Employ;
public class EmployServiceImpl implements EmployService{
	EmployDao empDao=null;
	public EmployServiceImpl() {
		empDao=(EmployDao)new EmployDaoImpl();
	}
	@Override
	public Employ addEmp(Employ emp) {
		
		return empDao.addEmp(emp);
	}
	@Override
	public ArrayList<Employ> fetchAllEmp() {
		
		return empDao.fetchAllEmp();
	}
	@Override
	public Employ deleteEmpEid(int empId) {
		
		return empDao.deleteEmpEid(empId);
	}
	@Override
	public Employ getEmpbyId(int empId) {
		
		return empDao.getEmpbyId(empId);
	}
	@Override
	public Employ updateEmp(int empId, String newname, float newSal) {
		
		return empDao.updateEmp(empId, newname, newSal);
	
	}
	

}
