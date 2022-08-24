package org.comit.comit_project;

public class Customer {
	
	//Attributes (properties)
	
	int customerId;
	String firstName;
	String lastName;
	int telNumber;
	//int accountNumber;
	
	//Default Constructors
	
	Customer () {
		customerId = 0;
		firstName="";
		lastName="";
		telNumber=0;
		//accountNumber=0;
	}
	
	//Constructor with parameters.
	//right click -> source -> Generate Constructors using Fields
	
	public Customer(int customerId, String firstName, String lastName, int telNumber, int accountNumber) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
