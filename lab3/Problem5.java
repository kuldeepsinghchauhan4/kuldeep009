package com.capagemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date of manufacturing in this format year/month/day");
		String first[] = sc.nextLine().split("[\\s/-]+");

		int year = Integer.parseInt(first[0]);
		int month = Integer.parseInt(first[1]);
		int dayOfMonth = Integer.parseInt(first[2]);
		
		LocalDate myDate1 = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println("Enter the Warrenty period in this format year/month");
		String second[] = sc.nextLine().split("[\\s/-]+");

		year = Integer.parseInt(second[0]);
		month = Integer.parseInt(second[1]);
		
		int m = year*12+month;
		
		System.out.println("Product Exipre in ");
		System.out.println(myDate1.plusMonths(m));
		
		sc.close();

	}

}
