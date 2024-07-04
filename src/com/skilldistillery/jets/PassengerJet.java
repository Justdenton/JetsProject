package com.skilldistillery.jets;

public class PassengerJet extends Jet {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

// Indicates that a method declaration is intended to override a method declaration in a supertype.	
	@Override
	public void fly() {

		System.out.println(" " + getModel() + " " + getSpeed() + " " + getRange() / getSpeed() + " ");
		
	}

}
