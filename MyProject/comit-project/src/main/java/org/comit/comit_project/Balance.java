package org.comit.comit_project;

public class Balance {
	
	//Attributes (properties)
	
	int accountNumber;
	int payments;
	int consumption;
	
	//Default constructors
	Balance() {
		accountNumber = 0;
		payments = 0;
		consumption = 0;
	}
	
	//Constructor with parameters.
	//right click -> source -> Generate Constructors using Fields
		

	public Balance(int accountNumber, int payments, int consumption) {
		super();
		this.accountNumber = accountNumber;
		this.payments = payments;
		this.consumption = consumption;
	}
}
