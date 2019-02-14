package com.capagemini.lab4.service;

import java.util.Scanner;

import com.capagemini.lab4.Exception.InsuffiecientBalanceException;
import com.capagemini.lab4.Exception.InvailidAccountNumberException;
import com.capagemini.lab4.Exception.InvailidInitialBalanceException;
import com.capagemini.lab4.bl.AccountSchedular;

public class Client {
	
	static Scanner sc = new Scanner(System.in);
	
	static AccountSchedular handle = new AccountSchedular();
	
	public static void main(String[] args) {
		
		while(true) {
			showMenu();
		}

	}

	private static void showMenu() {
		
		System.out.println("Enter Your Choice \n"
				+ "1. Create Account \n"
				+ "2. Deposit Balance \n"
				+ "3. Withdraw Balance \n"
				+ "4. Show Account \n"
				+ "5. Fund Transfer \n"
				+ "6. Exit \n");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		
		case 1: createAccount();
				break;
				
		case 2:	depositAccount();
				break;
				
		case 3: withdraw();
				break;
				
		case 4: showMyAccount();
				break;
				
		case 5: fundTransfer();
				break;
				
		case 6: System.exit(0);
		
		default : System.out.println("\n You Have Entered wrong Choice \n");
		}
	}

	private static void createAccount() {
		
		System.out.println("Enter the Initial Balance Amount");
		double initialBalance = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the Name of Account holder");
		String accountHolderName = sc.nextLine();
		
		System.out.println("Enter the Age of Account holder");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Type of Account holder");
		String accType = sc.nextLine();
		
		try {
			System.out.println(handle.createAccount(initialBalance, accountHolderName, age, accType));
		}
		catch(InvailidInitialBalanceException e) {
			System.out.println("Your Initial balance is less than 500");
		}
	}

	
	private static void depositAccount() {
		
		System.out.println("Enter the Account Number");
		long accountNumber= sc.nextLong();
		
		System.out.println("Enter the Balance Amount");
		double balanceToAdd = sc.nextDouble();
		sc.nextLine();
		
		try {
			System.out.println(handle.deposit(accountNumber, balanceToAdd));
		}
		catch(InvailidAccountNumberException e) {
			System.out.println("Opps, It's look like you have entered wrong account Number");
		}
		
	}

	private static void withdraw() {
		
		System.out.println("Enter the Account Number");
		long accountNumber= sc.nextLong();
		
		System.out.println("Enter the Initial Balance Amount");
		double balanceToWithdraw = sc.nextDouble();
		sc.nextLine();
		
		try {
			
			System.out.println(handle.withdraw(accountNumber, balanceToWithdraw));
		}
		catch(InsuffiecientBalanceException e) {
			System.out.println("Opps, you have Insuffiecient Balance");
		}
		catch (InvailidAccountNumberException e) {
			System.out.println("Opps, It's look like you have entered wrong account Number");
			e.printStackTrace();
		}
		
	}

	private static void showMyAccount() {
		
		System.out.println("Enter the Account Number");
		long accountNumber= sc.nextLong();
		sc.nextLine();
		try {
			
			System.out.println(handle.showAccount(accountNumber));
		}
		catch(InvailidAccountNumberException e) {
			System.out.println("Opps, It's look like you have entered wrong account Number");
		}
	}

	private static void fundTransfer() {
		
		System.out.println("Enter the Sender Account Number");
		long senderAccountNumber= sc.nextLong();
		
		System.out.println("Enter the Receiver Account Number");
		long receiverAccountNumber= sc.nextLong();
		
		System.out.println("Enter the Balance Amount to Transfer");
		double balanceToTransfer = sc.nextDouble();
		sc.nextLine();
		
		try {
			System.out.println(handle.FundTransfer(senderAccountNumber, receiverAccountNumber, balanceToTransfer));
		}
		catch(InvailidAccountNumberException e) {
			System.out.println("Opps, It's look like you have entered wrong account Number");
		}
		catch(InsuffiecientBalanceException ee) {
			System.out.println("Opps, you have Insuffiecient Balance");
		}
	}

}
