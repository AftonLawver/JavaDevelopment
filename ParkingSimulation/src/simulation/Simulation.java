package simulation;
import java.util.Scanner;

import classes.ParkedCar;
import classes.ParkingMeter;
import classes.ParkingTicket;
import classes.PolliceOfficer;

public class Simulation {

	private static void displayMenu() {
		System.out.println("---------------Parking Ticket Simulation---------------");
		System.out.println("Press one of the following numbers and press enter:");
		System.out.println("1 - Show 1st simulation for issuing a ticket.");
		System.out.println("2 - Show 2nd simulation for issuing a ticket.");
		System.out.println("3 - Show 3rd simulation for issuing a ticket.");
		System.out.println("4 - exit the program");
		System.out.print("Choice:");
	}
	
	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		Scanner scannerContinue = new Scanner(System.in);
		do {
			try {
				displayMenu();
				choice = scanner.nextInt();
				if (choice == 1) {
					//creating objects
					System.out.println("---Parked car information.---");
					ParkedCar parkedCar = new ParkedCar("Ford","Mustang","PO81781", "Blue", 1930, 4, 0);
					System.out.println(parkedCar.toString());
					System.out.println("-----------------------------");
					System.out.println("Time parked(military format):" + String.valueOf(parkedCar.getTimeParked()));
					System.out.println("Minutes purchased:" + parkedCar.getMinutesPurchased() + " minutes.");
					System.out.println("Minutes already in parking:" + String.valueOf(parkedCar.getMinutesInParking()+ " minutes."));
					System.out.println("Minutes of legal parking left(negative number means illegal minutes):" + String.valueOf(parkedCar.getMinutesLeft()+ " minutes."));
					System.out.println("------Inspecting a car-------");
					PolliceOfficer polliceOfficer = new PolliceOfficer("KJ2312", "Simun, Adam");
					//examining parked car
					System.out.println("-----------------------------");
					int fine = polliceOfficer.issueParkingTicket(parkedCar);
					if (fine==0) {
						System.out.println("No fine will be issued.");
					}
					else {
						System.out.println("Fine: " + String.valueOf(fine) + "$");
					}
					System.out.println("-----------------------------");
				}
				else if ( choice == 2) {
					//creating objects
					System.out.println("---Parked car information.---");
					ParkedCar parkedCar = new ParkedCar("Toyota"," Yaris","IL13213", "Red", 1500, 5, 0);
					System.out.println(parkedCar.toString());
					System.out.println("-----------------------------");
					System.out.println("Time parked(military format):" + String.valueOf(parkedCar.getTimeParked()));
					System.out.println("Minutes purchased:" + parkedCar.getMinutesPurchased() + " minutes.");
					System.out.println("Minutes already in parking:" + String.valueOf(parkedCar.getMinutesInParking()+ " minutes."));
					System.out.println("Minutes of legal parking left(negative number means illegal minutes):" + String.valueOf(parkedCar.getMinutesLeft()+ " minutes."));
					System.out.println("------Inspecting a car-------");
					PolliceOfficer polliceOfficer = new PolliceOfficer("KJ2312", "John, Mike");
					//examining parked car
					System.out.println("-----------------------------");
					int fine = polliceOfficer.issueParkingTicket(parkedCar);
					if (fine==0) {
						System.out.println("No fine will be issued.");
					}
					else {
						System.out.println("Fine: " + String.valueOf(fine) + "$");
					}
					System.out.println("-----------------------------");
				}
				else if ( choice == 3) {
					//creating objects
					System.out.println("---Parked car information.---");
					ParkedCar parkedCar = new ParkedCar("Toyota"," Camry","OH1032", "Yellow", 1450, 40, 0);
					System.out.println(parkedCar.toString());
					System.out.println("-----------------------------");
					System.out.println("Time parked(military format):" + String.valueOf(parkedCar.getTimeParked()));
					System.out.println("Minutes purchased:" + parkedCar.getMinutesPurchased() + " minutes.");
					System.out.println("Minutes already in parking:" + String.valueOf(parkedCar.getMinutesInParking()+ " minutes."));
					System.out.println("Minutes of legal parking left(negative number means illegal minutes):" + String.valueOf(parkedCar.getMinutesLeft()+ " minutes."));
					System.out.println("------Inspecting a car-------");
					PolliceOfficer polliceOfficer = new PolliceOfficer("R0192", "Kin, Michael");
					//examining parked car
					System.out.println("-----------------------------");
					int fine = polliceOfficer.issueParkingTicket(parkedCar);
					if (fine==0) {
						System.out.println("No fine will be issued.");
					}
					else {
						System.out.println("Fine: " + String.valueOf(fine) + "$");
					}
					System.out.println("-----------------------------");
				}
				else if ( choice == 4) {
					System.out.println();
					System.out.println("------------------------------------------------------------");
					System.out.println("Exiting the simulation.");
					System.out.println("------------------------------------------------------------");
					System.out.println();
					System.exit(0);
				}
				else {
					System.out.println();
					System.out.println("------------------------------------------------------------");
					System.out.println("Wrong option picked. Please try again.");
					System.out.println("------------------------------------------------------------");
					System.out.println();
				}
			}
			catch (Exception e) {
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println("That option is not avaiable. Please input a number.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			System.out.print("Press any button to continue...");
			scannerContinue.nextLine();
		} while (choice != 4); //exit simulation when 4 was pressed
		scanner.close();
	}

}
