package com.capagemini.lab3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		//check String Positive or not
		Scanner sc = new Scanner(System.in);
		String input="";
		String s[] = sc.nextLine().toUpperCase().split("[\\s@&.?$+-]+");
		for(int i=0;i<s.length;i++) {
			input += s[i];
		}
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i) < input.charAt(i-1)) {
				System.out.println("Negative String");
				System.exit(0);
			}
		}
		System.out.println("Positive String");
		sc.close();
	}

}
