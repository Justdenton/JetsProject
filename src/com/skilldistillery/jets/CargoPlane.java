package com.skilldistillery.jets;

import java.text.NumberFormat;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		NumberFormat commaFormat = NumberFormat.getInstance();
		System.out.println("Cargo Plane: " + getModel() + 
				" is flying " + commaFormat.format(getSpeed()) + " MPH for " + 
				commaFormat.format(getRange() / getSpeed()) + " hours.");
	}

	@Override
	public void loadCargo() {

		System.out.println(getModel() + " is loading cargo.");
	}

}
