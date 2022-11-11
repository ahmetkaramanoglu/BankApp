package com.kahmet.InAccount;

 public class Account {
	private String name;
	private double balance;
	
	
	public Account(String name,double balance) {
		this.name = name;
		this.balance = balance;
	}
	public boolean withDraw(double amountWithDraw) {
		if(balance < amountWithDraw) {
			System.out.println("Lutfen hesabınızda bulunan para miktarı arasında işlem yapınız.");
			return false;
		}
		double temp = balance - amountWithDraw;
		balance = temp;
		return true;
	}
	public void deposit(double amountDeposited) {
		double temp = balance + amountDeposited;
		balance = temp;
	}
	public void printInfo() {
		System.out.println(name+ " adlı hesapta bulunan para " + balance + "'dir.");
	}
	
}
