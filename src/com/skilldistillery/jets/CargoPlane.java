package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		System.out.println("Cargo Plane: " + getModel() + "is flying " + getSpeed() + "MPH for " + getRange() / getSpeed() + " ");

	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}

}
