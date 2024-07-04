package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	// Two fields MAX.
	private AirField airfield = new AirField();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) { // User Story 1

		JetsApp ja = new JetsApp();
		ja.launchApp();
	}

	// launchApp ***********************************************************
	private void launchApp() {

		// The program continues until the user selects the option number to Quit, which
		// exits the program.
		int choice = 0;
		
		while (choice != 9) {	// User Story 11
			displayUserMenu();
			choice = kb.nextInt();

			switch (choice) {
		// List fleet prints out the model, speed (in MPH), range, and price of each
		// jet.
		// (There must be 5 jets stored in the AirField when the program starts).
			case 1:
				airfield.listFleet();
				break;

		// Fly all Jets calls the fly() method on the entire fleet of jets.
		// fly() prints out the model, speed (in MPH), range,
		// and price and the amount of time the jet can fly until it runs out of fuel
		// (based on speed and range).
			case 2:
				airfield.flyAllJets();
				break;

		// The view fastest jet and longest range options both display the jet's model,
		// speed (in MPH), range, and price.
		// NOTE: These methods must search the collection of jets to find the
		// appropriate jet.
			case 3:
				airfield.viewFastestJet();
				break;
			case 4:
				airfield.viewJetLongestRange();
				break;
		// 5 & 6 - instanceof might make sense
		// The user is presented with an option specific to the interfaces you created.
		// Example: Load all Cargo Jets, above, finds all implementors of the
		// CargoCarrier interface and calls loadCargo() on each.
			case 5:
			// Load all Cargo Jets (only CargoPlane)
			case 6:
			// Dogfight! (only FighterJet)

			// A use can add a Jet to the fleet.
			// This can be a PassengerJet.
			// Users are prompted to enter the Jet's model, speed (in MPH), range, and
			// price.
			// And it is added to the AirField.
			case 7:
				airfield.addJetToFleet(Scanner kb);
				break;

		// A user can remove a jet from the fleet.
		// The user is presented with a sub-menu allowing them to select which jet in
		// the fleet to delete
		// by its number.
			case 8:
				airfield.removeJetFromFleet(kb);
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
	}
}
