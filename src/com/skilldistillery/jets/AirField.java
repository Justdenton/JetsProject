package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS

	private ArrayList<Jet> jets; // User Story 2

	public AirField() {
		jets = new ArrayList<>();
		// Create 5 different jet objects.
		// Add them to list.
		jets.add(new PassengerJet("PassengerModelOne", 500, 5000, 500000000));
		
		jets.add(new CargoPlane("CargoModelOne", 600, 6000, 600000000));
		jets.add(new CargoPlane("CargoModelTwo", 700, 7000, 700000000));
		
		jets.add(new FighterJet("FighterModelOne", 800, 8000, 800000000));
		jets.add(new FighterJet("FighterModelTwo", 900, 9000, 900000000));
	}

	// Do NOT create a getJets() method.

	// add jet method that accepts an argument for a jet and adds
	// it to the list
	// send jet to airfield (airfield adds to list) - encapsulation

	private void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);	// User Story 5
		}
	}

	private void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	private void addJetToFleet(Scanner kb) { // AIRFIELD CANT HAVE ANY ADDITIONAL FIELDS - what to do with kb
																		//public vs private
		System.out.println("Please enter the model: ");					// is importing kb into this OK?
		String model = kb.next();
		
		System.out.println("Please enter the speed, in MPH: ");
		double speed = kb.nextDouble();
		
		System.out.println("Please enter the range, in miles: ");
		int range = kb.nextInt();
		
		System.out.println("Please enter the price: ");
		long price = kb.nextLong();
		
	}

	private void removeJetFromFleet(Scanner kb) {

		System.out.println("Select the number of the jet that you would like to remove: ");
		listFleet();
		int removeIndex = kb.nextInt();
	}

	/*
	 * The view fastest jet and longest range options both display: the jet's model,
	 * speed (in MPH), range, and price.
	 * 
	 * NOTE: These methods must search the collection of jets to find the
	 * appropriate jet.
	 */
	private void viewFastestJet() {

	}

	private void viewJetLongestRange() {

	}
	
	// UNSURE IF THESE BELONG, review interfaces & instanceof & implements**************************************
	/*
	 * The user is presented with an option specific to the interfaces you created. 
	 * For example, Load all Cargo Jets, above, finds all implementors of the CargoCarrier interface and 
	 * then calls loadCargo() on each.
	 */
	
	public void loadAllCargo() {
		// for each JET of JETS
		for(Jet jet : jets) {
			// and if JET is an instance of Cargo
			if (jet instanceof CargoCarrier) {
				// then calls loadCargo onto all implementors of CargoCarrier
				((CargoCarrier) jet).loadCargo();
			}
		}
	}
	
	public void dogfight() {
		
		for(Jet jet : jets) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}
	}
	
	// UNSURE IF THESE BELONG, review interfaces & instanceof & implements**************************************
	
	
	
	
	
	
	
	
	

}
