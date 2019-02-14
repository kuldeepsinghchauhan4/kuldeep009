package com.capagemini.lab4.bl;

import java.util.HashMap;
import java.util.Map;

import com.capagemini.lab4.Exception.InsuffiecientBalanceException;
import com.capagemini.lab4.Exception.InvailidAccountNumberException;
import com.capagemini.lab4.Exception.InvailidInitialBalanceException;
import com.capagemini.lab4.beans.Account;
import com.capagemini.lab4.beans.AccountType;
import com.capagemini.lab4.beans.Person;

public class AccountSchedular {
	
	private static long basicAcountNumber = 22222220;
	private Map<Long, Account> accounts = new HashMap<>();
	
	
	
	public String createAccount(double initialBalance, String accountHolderName, float age, String accType) throws InvailidInitialBalanceException {
		
		if(initialBalance < 500) {
			throw new InvailidInitialBalanceException();
		}
		
		Person person = new Person(accountHolderName, age);
		AccountType accountType = new AccountType(accType);
		Account account = new Account(basicAcountNumber, initialBalance, person, accountType);
		
		accounts.put(basicAcountNumber, account);
		
		basicAcountNumber++;
		
		return  "Account Created Successfully :  \n" +
				"Account Number : " + account.getAccNum() + '\n' +
				"Account Holder Name : " + person.getName() + '\n' +
				"Account Balance : " + account.getBalance() + '\n' +
				"Account Type : " + accountType.getAccountType() + '\n' +
				"Account Holder Age : " + person.getAge() + '\n' ;
	}
	
	
	
	
	
	public String deposit(long accountNumber, double balanceToAdd) throws InvailidAccountNumberException {
		
		if(accounts.containsKey(accountNumber)) {
			
			Account account = accounts.get(accountNumber);
			account.setBalance(account.getBalance() + balanceToAdd);
			
			return "Balance Added Successfully \n Your Current Balance is : "+ account.getBalance();
		}
		
		else{
			throw new InvailidAccountNumberException();
		}
	}
	
	
	
	
	public String withdraw(long accountNumber, double balanceToWithdraw) throws InsuffiecientBalanceException, InvailidAccountNumberException {
		
		if(accounts.containsKey(accountNumber)) {
			Account account = accounts.get(accountNumber);
			
			if(account.getBalance() >= balanceToWithdraw) {
				account.setBalance(account.getBalance() - balanceToWithdraw);
				
				return "Withdraw Amount Successfully \n your Current Balance is : "+account.getBalance();
			}
			
			else {
				throw new InsuffiecientBalanceException();
			}
		}
		
		else{
			throw new InvailidAccountNumberException();
		}
	}
	
	
	
	public String showAccount(long accountNumber) throws InvailidAccountNumberException {
		
		if(accounts.containsKey(accountNumber)) {
			
			Account account = accounts.get(accountNumber);
			Person person = account.getAccHolder();
			AccountType accountType = account.getAccountType();
			
			return  "Account Number : " + account.getAccNum() + '\n' +
					"Account Holder Name : " + person.getName() + '\n' +
					"Account Balance : " + account.getBalance() + '\n' +
					"Account Type : " + accountType.getAccountType() + '\n' +
					"Account Holder Age : " + person.getAge() + '\n' ;
		}
		
		else {
			
			throw new InvailidAccountNumberException();
		}
	}
	
	
	public String FundTransfer(long senderAccountNumber, long receiverAccountNumber, double balanceToTransfer) throws InvailidAccountNumberException, InsuffiecientBalanceException {
		
		if(accounts.containsKey(senderAccountNumber) && accounts.containsKey(receiverAccountNumber)) {
			
			Account sender = accounts.get(senderAccountNumber);
			Account receiver = accounts.get(receiverAccountNumber);
			
			if(sender.getBalance() >= balanceToTransfer) {
				
				receiver.setBalance(receiver.getBalance() + balanceToTransfer);
				sender.setBalance(sender.getBalance() - balanceToTransfer);
				
				
				return "Transaction is Successfully \n now Your Total Amount is : " + sender.getBalance();
			}
			
			else {
				
				throw new InsuffiecientBalanceException();
			}
		}
		
		else {
			
			throw new InvailidAccountNumberException();
		}		
	}
	
}
