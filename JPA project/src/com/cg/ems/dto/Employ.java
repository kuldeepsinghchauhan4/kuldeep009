package com.cg.ems.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="emp1")
public class Employ {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id",length=20)
	private int empId;
	@Column(name="emp_name",length=30)
	private String empName;
	@Column(name="emp_sal",length=10)
	private float empSal;
	//jpa will not map this property with table
	@Transient
	private LocalDate empDOJ;
	public Employ() {
	}
	
	
	public Employ(int empId, String empName, float empSal, LocalDate empDOJ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDOJ = empDOJ;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public LocalDate getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(LocalDate empDOJ) {
		this.empDOJ = empDOJ;
	}
	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDOJ=" + empDOJ + "]";
	}
	
	

}
