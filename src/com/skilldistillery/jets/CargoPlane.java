package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		System.out.println("Cargo Plane: " + getModel() + " is flying " + getSpeed() + " MPH for " + (double) getRange() / getSpeed() + " hours.");
		
	}

	@Override
	public void loadCargo() {

		System.out.println(getModel() + " is loading cargo.");
		// Should print "LOADING CARGO!"
	}

}
