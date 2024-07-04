package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		
		super(model, speed, range, price);
	}

// Indicates that a method declaration is intended to override a method declaration in a supertype.	
	@Override
	public void fly() {

		System.out.println(" " + getModel() + " " + getSpeed() + " " + getRange() / getSpeed() + " ");
		
	}
	
// Indicates that a method declaration is intended to override a method declaration in a supertype.	
	@Override
	public void fight() {
		
		System.out.println(" " + getModel() + " ");
		
	}

}
