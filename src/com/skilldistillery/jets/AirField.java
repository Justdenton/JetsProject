package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS

	private ArrayList<Jet> jets; // User Story 2

	public AirField() {
		jets = new ArrayList<>();
		// Create 5 different jet objects.
		// Add them to list.
		jets.add(new PassengerJet(PassengerModelOne, 500, 5000, 500000000));
		
		jets.add(new CargoPlane(CargoModelOne, 600, 6000, 600000000));
		jets.add(new CargoPlane(CargoModelTwo, 700, 7000, 700000000));
		
		jets.add(new FighterJet(FighterModelOne, 800, 8000, 800000000));
		jets.add(new FighterJet(FighterModelTwo, 900, 9000, 900000000));
		
		
		
		
	}

	// Do NOT create a getJets() method.

	// add jet method that accepts an argument for a jet and adds
	// it to the list
	// send jet to airfield (airfield adds to list) - encapsulation

	private void listFleet() {

	}

	private void flyAllJets() {

	}

	private void addJetToFleet() {

	}

	private void removeJetFromFleet() {

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

}
