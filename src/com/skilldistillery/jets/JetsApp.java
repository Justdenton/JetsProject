package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	// Two fields MAX.
	private AirField airfield = new AirField();
	private Scanner kb = new Scanner(System.in);

	// User Story 1
	public static void main(String[] args) { 

		JetsApp ja = new JetsApp();
		ja.launchApp();
	}

	private void launchApp() {

		int choice = 0;
		
		// // User Story 11 
		// ( loop condition "!= 9" keeps the program active until user chooses to quit.
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
			// (only CargoPlane) - ADDED tested and functional.
				airfield.loadAllCargo();
				break;
			case 6:
			// (only FighterJet) - ADDED tested and functional. 
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
		
		kb.close(); // Close here since no longer opening 2nd kb (bad form).
		
	}

	// User Story 4
	private void displayUserMenu() {
		   
		System.out.printf("%n=========================================%n");
	    System.out.printf("|         Jets Application Menu         |%n");
	    System.out.printf("=========================================%n");
	    System.out.printf("Please make a selection: %n");
	    System.out.printf("1. List fleet.%n");
	    System.out.printf("2. Fly all jets.%n");
	    System.out.printf("3. View fastest jet.%n");
		System.out.printf("4. View jet with longest range.%n");
	    System.out.printf("5. Load all Cargo Jets.%n");
		System.out.printf("6. Dogfight!%n");
	    System.out.printf("7. Add a jet to Fleet.%n");
		System.out.printf("8. Remove a jet from Fleet.%n");
		System.out.printf("9. Quit.%n");
		System.out.printf("=========================================%n");
		
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
