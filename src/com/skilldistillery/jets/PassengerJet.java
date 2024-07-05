package com.skilldistillery.jets;

import java.text.NumberFormat;

public class PassengerJet extends Jet {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		
		NumberFormat commaFormat = NumberFormat.getInstance();
		System.out.println("Passenger Jet: " + getModel() + 
				" is flying " + commaFormat.format(getSpeed()) + " MPH for " + 
				commaFormat.format(getRange() / getSpeed()) + " hours.");
	}
	
}
