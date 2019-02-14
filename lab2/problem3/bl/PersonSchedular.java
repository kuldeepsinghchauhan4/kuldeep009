package com.capagemini.lab2.problem3.bl;

import com.capagemini.lab2.problem3.beans.Person;

public class PersonSchedular {
	
	Person person;
	
	public boolean showDetails(String firstName, String lastName, char gender) {
		person = new Person(firstName, lastName, gender);
		return true;

	}
	
	public boolean addPhoneNumber(String phoneNumber) {
		person.setPhoneNumber(phoneNumber);
		return true;
	}

	public String showAll() {
		return "Person Details"+'\n'+"______________________" +
				'\n' + "First Name: " + person.getFirstName() + 
				'\n' + "Last Name: " + person.getLastName() +
				'\n' + "Gender: " + person.getGender() + 
				'\n' + "PhoneNumber: " + person.getPhoneNumber() +
				'\n';
		
	}
}
