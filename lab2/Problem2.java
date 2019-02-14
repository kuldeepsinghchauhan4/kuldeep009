package com.capagemini.lab2;

public class Problem2 {

	public static void main(String[] args) {
		
		try {
			if(args[0].charAt(0) == '-') {
				System.out.println("Number is Negative");
			}
			else {
				System.out.println("Number is Positive");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please Enter input with Command");
		}

	}

}
