package ATMapp;

import java.util.Scanner;

public class Account {
	private double checkingBalance = 0.0;
	private double savingBalance = 0.0;
	private int accountNumber;
	private int accountPin;
	
	Scanner read = new Scanner(System.in);
	
	public boolean setCustomerNumber(int customerNum) {
		accountNumber = customerNum;
		
		return true;
	}
	
	public int getCustomerNumber() {
		return accountNumber;
	}
	
	public boolean setPinNumber(int pinNum) {
		accountPin = pinNum;
		
		return true;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public void getCheckingDeposite() {
		
		System.out.println("Eneter deposite amount: ");
		 
		double amount = read.nextDouble();
		
		while((checkingBalance + amount) < 0) {
			System.out.println("Balance can not be negative, enter other amount: ");
			amount = read.nextDouble();
		}
	
		calcCheckingDeposite(amount);
		System.out.println("New Cheching Account balance: " + getCheckingBalance());

	}
	
	public void getSavingDeposite() {
		
		System.out.println("Eneter deposite amount: ");
		double amount = read.nextDouble();
		
		while((savingBalance + amount) < 0) {
			System.out.println("Balance can not be negative, enter other amount: ");
			amount = read.nextDouble();
		}
	
		calcSavingDeposite(amount);
		System.out.println("New Savings Account balance: " + getSavingBalance());
	}
	
	public void getCheckingWithdrawl() {
		
		System.out.println("Eneter withdrawl amount: ");
		double amount = read.nextDouble();
		
		while(checkingBalance < amount) {
			System.out.println("insufficient Funds, Please eneter other amount: ");
			amount = read.nextDouble();
		}
		
		calcCheckingWithdrawl(amount);
		System.out.println("New Checking Account balance: " + getCheckingBalance());
	}
	

	public void getSavingWithdrawl() {
		
		System.out.println("Eneter withdrawl amount: ");
		double amount = read.nextDouble();
		
		while(savingBalance < amount) {
			System.out.println("insufficient Funds, Please eneter other amount: ");
			amount = read.nextDouble();
		}
		
		calcSavingWithdrawl(amount);
		System.out.println("New Savings Account balance: " + getSavingBalance());
	}
	
	public double calcCheckingWithdrawl(double amount) {
		checkingBalance -= amount;
		return checkingBalance;
	}

	public double calcSavingWithdrawl(double amount) {
		savingBalance -= amount;
		return savingBalance ;
	}

	public double calcCheckingDeposite(double amount) {
		checkingBalance += amount;
		return checkingBalance;
	}

	public double calcSavingDeposite(double amount) {
		savingBalance += amount;
		return savingBalance ;
	}
	
}
