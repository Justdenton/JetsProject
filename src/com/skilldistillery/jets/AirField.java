package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS

	private ArrayList<Jet> jets; 

	public AirField() {
		jets = new ArrayList<>();
		
		jets.add(new PassengerJet("PassengerModelOne", 500, 5000, 500000000));
		
		jets.add(new CargoPlane("CargoModelOne", 600, 6000, 600000000));
		jets.add(new CargoPlane("CargoModelTwo", 700, 7000, 700000000));
		
		jets.add(new FighterJet("FighterModelOne", 800, 8000, 800000000));
		jets.add(new FighterJet("FighterModelTwo", 900, 9000, 900000000));
	}

	public void listFleet() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println((i + 1) + " : " + jets.get(i));
		}
	}
	
	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

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

	public void removeJetFromFleet(int indexJA) {

		if (indexJA > 0 && indexJA <= jets.size()) {
			jets.remove(indexJA - 1);
			System.out.println("Plane removed!");
		} else {
			System.out.println("Invalid selection!");
		}
	}

/*
 * NOTE: These methods must search the collection of jets to find the appropriate jet. (fast/long)
 */
	
	public void viewFastestJet() {
		
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		
		System.out.println("Fastest jet: " + fastestJet);

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
