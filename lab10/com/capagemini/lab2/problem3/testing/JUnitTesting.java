package com.capagemini.lab2.problem3.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capagemini.lab2.problem3.beans.Person;

public class JUnitTesting {

	enum GENDER{M, F};
	
	@Test
	public void checkingForFirstName() {
		Person person = new Person();
		person.setFirstName("YANSHU");
		assertEquals("YANSHU", person.getFirstName());
	}
	@Test
	public void checkingForLastName() {
		Person person = new Person();
		person.setLastName("Gupta");
		assertEquals("Gupta", person.getLastName());
	}
	@Test
	public void checkingForGender() {
		Person person = new Person();
		person.setGender('M');
		assertEquals(com.capagemini.lab2.problem3.beans.Person.GENDER.M, person.getGender());
	}
	@Test
	public void checkingForPhoneNumber() {
		Person person = new Person();
		person.setPhoneNumber("1234567890");
		assertEquals("1234567890", person.getPhoneNumber());
	}
	
}
