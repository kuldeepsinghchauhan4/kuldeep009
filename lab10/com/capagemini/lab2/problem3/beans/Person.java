package com.capagemini.lab2.problem3.beans;

public class Person {
	
	public enum GENDER{M, F};
	private String firstName;
	private String lastName;
	private GENDER gender=GENDER.M;
	private String phoneNumber = null;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(gender == 'M' || gender == 'm')
			this.gender = GENDER.M;
		else
			this.gender = GENDER.F;
	}

	public Person(String firstName, String lastName, char gender, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(gender == 'M' || gender == 'm')
			this.gender = GENDER.M;
		else
			this.gender = GENDER.F;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if(gender == 'M' || gender == 'm')
			this.gender = GENDER.M;
		else
			this.gender = GENDER.F;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
	}
	
}
