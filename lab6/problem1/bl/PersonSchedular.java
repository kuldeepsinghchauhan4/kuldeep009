package com.cg.eis.lab6.problem1.bl;

import com.cg.eis.lab6.problem1.Exception.InvailidNameException;
import com.cg.eis.lab6.problem1.beans.Person;

public class PersonSchedular {
	
	Person person;
	
	public boolean showDetails(String firstName, String lastName, char gender) throws InvailidNameException {
		if(firstName == "" || firstName==null || lastName=="" || lastName ==null) {
			throw new InvailidNameException();
		}
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