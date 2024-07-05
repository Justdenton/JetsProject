package com.skilldistillery.jets;

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
		return "Model: " + model + " || Speed: " + speed + " MPH || Range: " + range + " miles || Price: $" + price;
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
