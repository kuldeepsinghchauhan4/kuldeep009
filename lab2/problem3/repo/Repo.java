package com.capagemini.lab2.problem3.repo;
import java.util.Scanner;

import com.capagemini.lab2.problem3.bl.PersonSchedular;


public class Repo {
	
	static Scanner sc = new Scanner(System.in);
	static PersonSchedular ps;
	
	public static void main(String[] args) {
		
		addPerson();
		showAll();
		addPhoneNumber();
		showAll();
	}

	private static void showAll() {
		System.out.println(ps.showAll());
		
	}

	private static void addPhoneNumber() {
		System.out.println("Enter Phone Number");
		String phoneNumber = sc.nextLine();
		ps.addPhoneNumber(phoneNumber);
	}

	private static void addPerson() {
		ps = new PersonSchedular();
		
		System.out.println("Enter Your First Name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Your Last Name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Your Gender M/F");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		boolean output = ps.showDetails(firstName, lastName, gender);
		
	}

}
