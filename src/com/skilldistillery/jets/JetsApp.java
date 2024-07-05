package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	// Two fields MAX.
	private AirField airfield = new AirField();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) { 

		JetsApp ja = new JetsApp();
		ja.launchApp();
	}

	private void launchApp() {

		int choice = 0;
		
		while (choice != 9) {	
			displayUserMenu();
			choice = kb.nextInt();

			switch (choice) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				airfield.viewFastestJet();
				break;
			case 4:
				airfield.viewJetLongestRange();
				break;
			case 5:
			// Load all Cargo Jets (only CargoPlane)
				airfield.loadAllCargo();
				break;
			case 6:
			// Dogfight! (only FighterJet)
				airfield.dogfight();
				break;
			case 7:
				addJetToFleet();
				break;
			case 8:
				removeJetFromFleet();
				break;
			case 9:
				System.out.println("You have chosen to quit. Goodbye!");
				break;

			default:
				System.out.println("Invalid entry, please try again!");

			}
		}
	}

	private void displayUserMenu() {
		System.out.println(); // SPACING
		System.out.println("Please make a selection: ");
		System.out.println("1. List fleet.");
		System.out.println("2. Fly all jets.");
		System.out.println("3. View fastest jet.");
		System.out.println("4. View jet with longest range.");
		System.out.println("5. Load all Cargo Jets.");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet.");
		System.out.println("8. Remove a jet from Fleet.");
		System.out.println("9. Quit.");
		System.out.println(); // SPACING
	}
	
	// Pass scanner inputs into AirField (instead of opening 2nd scanner in AirField)
	private void addJetToFleet() {
		
		System.out.println("Enter the model: ");
		String model = kb.next();
		
		System.out.println("Enter the speed, in MPH: ");
		double speed = kb.nextDouble();
		
		System.out.println("Enter the range, in miles: ");
		int range = kb.nextInt();
		
		System.out.println("Enter the price: ");
		long price = kb.nextLong();
		
		System.out.println("Select the type of jet: (1) Passenger Jet (2) Fighter Jet (3) Cargo Plane");
		int type = kb.nextInt();
		
		airfield.addJetToFleet(model, speed, range, price, type);
		
	}
	
	private void removeJetFromFleet() {
		
		System.out.println("Please select the number of the jet that you would like to remove: ");
		airfield.listFleet();
		int indexJA = kb.nextInt();
		airfield.removeJetFromFleet(indexJA);
	}	
	
}
