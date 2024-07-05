package com.skilldistillery.jets;

public class PassengerJet extends Jet {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {

		System.out.println("Passenger Jet: " + getModel() + " is flying " + getSpeed() + " MPH for " + (double) getRange() / getSpeed() + " hours.");
		
	}
	
}
