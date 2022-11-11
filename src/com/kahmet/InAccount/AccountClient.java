package com.kahmet.InAccount;

public class AccountClient {
		
		
		public void transfer(double amount, Account giver,Account reciever) {
			
			if(giver.withDraw(amount)) {
				reciever.deposit(amount);
			}
			
			
		}
		
	
}
