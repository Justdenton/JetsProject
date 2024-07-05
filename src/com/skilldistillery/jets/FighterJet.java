package com.skilldistillery.jets;

import java.text.NumberFormat;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		
		NumberFormat commaFormat = NumberFormat.getInstance();
		System.out.println("Fighter Jet: " + getModel() + 
				" is flying " + commaFormat.format(getSpeed()) + " MPH for " + 
				commaFormat.format(getRange() / getSpeed()) + " hours.");
	}
	
	@Override
	public void fight() {
		
		System.out.println(getModel() + " is engaging in dog fight!");
	}

}
