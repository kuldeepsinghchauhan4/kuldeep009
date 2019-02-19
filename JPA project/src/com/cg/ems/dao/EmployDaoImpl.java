package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.dto.Employ;
import com.cg.ems.util.JPAUtil;

public class EmployDaoImpl implements EmployDao{
EntityManager em=null;
EntityTransaction entityTran=null;
public  EmployDaoImpl () {
	em=JPAUtil.getEntityManger();
	entityTran=em.getTransaction();
}
	@Override
	public Employ addEmp(Employ emp) {
		entityTran.begin();
		// persist used for insertion
		em.persist(emp);
		entityTran.commit();
		return emp;
	}

	@Override
	public ArrayList<Employ> fetchAllEmp() {
	
		return null;
	}

	@Override
	public Employ deleteEmpEid(int empId) {
	
		return null;
	}

	@Override
	public Employ getEmpbyId(int empId) {
		
		return null;
	}

	@Override
	public Employ updateEmp(int empId, String newname, float newSal) {
		
		return null;
	}
	

}
