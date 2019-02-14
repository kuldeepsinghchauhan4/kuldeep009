package com.capagemini.lab3;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		String[] n = sc.nextLine().split("_job");
		if(n.length > 2) {
			for(int i=0;i<n.length-1;i++) {
				output += n[i];
			}
		}
		else {
			output = n[0];
		}
		if(output.length() < 8) {
			System.out.println("False");
		}
		else
			System.out.println("True");	
		}
}

