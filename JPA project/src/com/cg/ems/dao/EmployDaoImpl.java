package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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
	String selAllQry="SELECT emps FROM Employ emps";
	TypedQuery<Employ> tq=em.createQuery(selAllQry,Employ.class);
	ArrayList<Employ> empList=(ArrayList<Employ>) tq.getResultList();
		return empList;
	}

	@Override
	public Employ deleteEmpEid(int empId) {
		Employ e1=em.find(Employ.class, empId);
		entityTran.begin();
		//e1.setEmpId(empId);
		em.remove(e1);
		entityTran.commit();
		return e1;
	
	
	}

	@Override
	public Employ getEmpbyId(int empId) {
		Employ ee=em.find(Employ.class, empId);
		return ee;
	}

	@Override
	public Employ updateEmp(int empId, String newName, float newSal) {
		Employ ee=em.find(Employ.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		return ee;
	}
	

}
