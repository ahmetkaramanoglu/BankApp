package com.kahmet.AccountTest;
import com.kahmet.InAccount.*;

public class Test {

	public static void main(String[] args) {
		Account account = new Account("Ahmet",10_000);
		account.deposit(1000);
		account.printInfo();
		account.withDraw(500);
		account.printInfo();
		Account account2 = new Account("Omer",5000);
		account2.deposit(10_000);
		AccountClient accountClient = new AccountClient();
		accountClient.transfer(100, account, account2);
		account2.printInfo();
	}

}
