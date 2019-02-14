package com.capagemini.lab2;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Your Last Name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Your Gender M/F");
		String gender = sc.next();
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Weight");
		float weight = sc.nextFloat();
				
		System.out.println("Person Details"+'\n'+"______________________"+'\n');
		System.out.println("First Name: " + firstName + '\n' + "Last Name: " + lastName + '\n' + "Gender: " + gender + '\n' + 
				"Age: " + age + '\n' + "Weight: " + weight + '\n');
		
		sc.close();
	}
}
