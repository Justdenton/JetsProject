package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println("Fighter Jet: " + getModel() + "is flying " + getSpeed() + "MPH for " + getRange() / getSpeed() + " hours.");
		
	}
	
	@Override
	public void fight() {
		
		System.out.println(getModel() + " is commencing dog fight!");
		// Should print "COMMENCING DOG FIGHT!" 
	}

}
