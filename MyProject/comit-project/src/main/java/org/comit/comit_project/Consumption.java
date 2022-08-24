package org.comit.comit_project;

import java.util.Date;

public class Consumption {
	//Attributes (properties)
	
	Date date;
	int kilowattHours;
	
	//Default Constructor
	
	Consumption() {
		date = new Date();
		kilowattHours=0;
	}

	public Consumption(Date date, int kilowattHours) {
		super();
		this.date = date;
		this.kilowattHours = kilowattHours;
	}
	
	

}
