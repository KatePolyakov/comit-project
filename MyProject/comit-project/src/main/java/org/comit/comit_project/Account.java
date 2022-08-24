package org.comit.comit_project;

public class Account {
	
	//Attributes (properties)
	
	//int customerId;
	//String firstName;
	//String lastName;
	String address;
	int balance;
		
	//Default Constructors
		
	Account () {
		//customerId = 0;
		//firstName="";
		//lastName="";
		address="";
		balance=0;
		}
		
		//Constructor with parameters.
		
	public Account(int customerId, String firstName, String lastName, String address, int balance) {
		super();
		//this.customerId = customerId;
		//this.firstName = firstName;
		//this.lastName = lastName;
		this.address = address;
		this.balance = balance;
			
	}

}
