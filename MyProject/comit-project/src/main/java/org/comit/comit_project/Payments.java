package org.comit.comit_project;

import java.util.Date;

public class Payments {
	int accountNumber;
	Date payDate;
	int amount;
	
	Payments () {
		accountNumber=0;
		payDate = new Date();
		amount=0;
	}

	public Payments(int accountNumber, Date payDate, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.payDate = payDate;
		this.amount = amount;
	}
	
	

}
