package com.capagemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year/month/day");
		String d[] = sc.nextLine().split("[\\s/-]+");

		int year = Integer.parseInt(d[0]);
		int month = Integer.parseInt(d[1]);
		int dayOfMonth = Integer.parseInt(d[2]);
		
		LocalDate myDate = LocalDate.of(year, month, dayOfMonth);
		
		LocalDate date = LocalDate.now();
		
		Period p = Period.between(myDate, date);
		System.out.println(p.getYears()+"/"+p.getMonths()+"/"+p.getDays());
		sc.close();
		
	}

}
