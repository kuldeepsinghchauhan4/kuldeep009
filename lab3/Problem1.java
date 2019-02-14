package com.capagemini.lab3;

import java.util.Scanner;

public class Problem1 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		
		doOperation();

	}

	private static void doOperation() {
		System.out.println("Enter the String");
		s = sc.nextLine();
		while(true) {
			System.out.println("Please Select Your Choice"+ '\n' +
					"1. Add the String to itself" + '\n' + 
					"2. Replace odd positions with #" + '\n' + 
					"3. Remove duplicate characters in the String" + '\n' + 
					"4. Change odd characters to upper case" + '\n' +
					"5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1: s+=s;
			System.out.println(s);
			break;
			
			case 2:	changeOddWith();
			break;
			
			case 3: removeDuplicate();
			break;
			
			case 4: changeOddToUpperCase();
			break;
			
			case 5: System.exit(0);
			
			default: System.out.println("Wrong Choice");
			}
		}
		
	}

	private static void changeOddToUpperCase() {
		char a[] = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i] = Character.toUpperCase(a[i]);
			}
		}
		s = new String(a);
		System.out.println(s);

	}

	private static void removeDuplicate() {
		String output="";
		for(int i=0;i<s.length();i++) {
			if(output.indexOf(s.charAt(i)) == -1) {
				output += s.charAt(i);
			}
		}
		s = output;
		System.out.println(output);

	}

	private static void changeOddWith() {
		//Change Odd Character with #
		char a[] = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i] = '#';
			}
		}
		s = new String(a);
		System.out.println(s);

	}

}
