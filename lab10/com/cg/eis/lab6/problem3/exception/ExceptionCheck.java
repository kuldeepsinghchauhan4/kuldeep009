package com.cg.eis.lab6.problem3.exception;

import com.cg.eis.lab6.problem3.service.Service;

public class ExceptionCheck extends Exception {
	
	public String checking(int id, String name, double salary) {
		Service s = new Service();
		try {
			System.out.println(s.creatEmployee(id, name, salary));
		} catch (EmployeeException e) {
			return "Exception Handled";
		}
		return null;
	}
}
