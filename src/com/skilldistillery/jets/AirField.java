package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS

	// User Story 2 (ArrayList)
	private ArrayList<Jet> jets; 

	public AirField() {
		
		jets = new ArrayList<>();
		// User Story 3 (5 below)
		jets.add(new PassengerJet("PassengerModelOne", 500, 5000, 500000000));
		
		jets.add(new CargoPlane("CargoModelOne", 600, 6600, 600000000));
		jets.add(new CargoPlane("CargoModelTwo", 700, 8400, 700000000));
		
		jets.add(new FighterJet("FighterModelOne", 800, 10400, 800000000));
		jets.add(new FighterJet("FighterModelTwo", 900, 12600, 900000000));
	//	jets.add(new FighterJet("FighterModelThreeTESTsamespeed", 900, 9200, 910000000));
	//	jets.add(new FighterJet("FighterModelThreeTESTsamesRANGE", 901, 9200, 910000000));
	
	}

	// User Story 5 ( method called from JetsApp launchApp() ) 
	public void listFleet() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println((i + 1) + " : " + jets.get(i));
		}
	}
	// User Story 6 (3 subclasses of Jet use Override)
	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	// User Story 9 ( method called from JetsApp addJetToFleet() ) 
	// kb user inputs pass through (Stretch Goal completed in above () )
		// switch (type) knows where to store the newly added jet. 
	public void addJetToFleet(String model, double speed, int range, long price, int type) { 
	
		Jet newJet;
		
		switch (type) {
		
		case 1: 
			newJet = new PassengerJet (model, speed, range, price);
			break;
		case 2: 
			newJet = new FighterJet (model, speed, range, price);
			break;
		case 3: 
			newJet = new CargoPlane (model, speed, range, price);
			break;
		default:
			System.out.println("Invalid type! Adding as Passenger Jet.");
			newJet = new PassengerJet(model, speed, range, price);
		}
		
		jets.add(newJet);
		System.out.println("Jet added!");
		
	}

	// User Story 10 ( method called from JetsApp removeJetFromFleet() ) 
	// indexJA allows user to select by inputting the number.
	public void removeJetFromFleet(int indexJA) {

		if (indexJA > 0 && indexJA <= jets.size()) {
			jets.remove(indexJA - 1);
			System.out.println("Plane removed!");
		} else {
			System.out.println("Invalid selection!");
		}
	}

	// User Story 7 ( fastest() & longest() )
	public void viewFastestJet() {
		
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestJet.getSpeed()) {		
				fastestJet = jet;
			}
		}
		
		System.out.println("Fastest jet: " + fastestJet);
		// Addressing ties - not necessary (just be sure to have different speed values at start)
		// But if were to implement - changing > to >= above only cycles to the end of <>jets 
	}

	public void viewJetLongestRange() {
		
		Jet longestRangeJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getRange() > longestRangeJet.getRange()) {
				longestRangeJet = jet; 
			}
		}

		System.out.println("Jet with the longest range: " + longestRangeJet);
		
	}
	
	// User Story 8 ( loadAllCargo() & dog fight() )
	// Option specific to their interface (finds all IMPLEMENTORS of interface & calls method)
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
}
