package com.capagemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Date in this format year/month/day");
		String first[] = sc.nextLine().split("[\\s/-]+");

		int year = Integer.parseInt(first[0]);
		int month = Integer.parseInt(first[1]);
		int dayOfMonth = Integer.parseInt(first[2]);
		
		LocalDate myDate1 = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println("Enter the Second Date in this format year/month/day");
		String second[] = sc.nextLine().split("[\\s/-]+");

		year = Integer.parseInt(second[0]);
		month = Integer.parseInt(second[1]);
		dayOfMonth = Integer.parseInt(second[2]);
		
		LocalDate myDate2 = LocalDate.of(year, month, dayOfMonth);
		
		
		Period p = Period.between(myDate1, myDate2);
		System.out.println("year/month/day");
		System.out.println(p.getYears()+"/"+p.getMonths()+"/"+p.getDays());
		
		sc.close();
	}

}
