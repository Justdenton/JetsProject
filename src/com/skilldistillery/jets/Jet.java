package com.skilldistillery.jets;

import java.text.NumberFormat;

public abstract class Jet {

	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public abstract void fly();

	public double getSpeedInMach() {
		return this.speed / 767.269; 
	}	// 1 Speed of sound = 767.269 MPH

	// TO STRING
	@Override //?
	public String toString() {
		NumberFormat commaFormat = NumberFormat.getInstance();
		// 
		return "Model: " + model + 
				" || Speed: " + commaFormat.format(speed) + 
				" MPH || Range: " + commaFormat.format(range) + 
				" miles || Price: $" + commaFormat.format(price);
	}
	
	
	// GETTERS
	public String getModel() {
		return model;
	}

	public double getSpeed() {
		return speed;
	}

	public int getRange() {
		return range;
	}

	public long getPrice() {
		return price;
	}
		
}
