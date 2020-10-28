package replit;

import java.util.Scanner;

public class realEstateCalculator {

	public static void main(String[] args) {

		// DO NOT CHANGE
		int propertyPrice = 0;
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		// WRITE YOUR CODE HERE

		System.out.println("Enter your property type:");
		houseType = scan.next();
		System.out.println("Enter starting price:");
		int startingPrice = scan.nextInt();
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		System.out.println("do you have a backyard?");
		switch (houseType) {
		case "condo":
			System.out.println("Backyard is not available for condo!");
			break;
		default:

		}
		backyard = scan.nextBoolean();

		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();
		System.out.println("How many spots?");
		int spots = scan.nextInt();
		System.out.println("How close is metro station?");
		metroAccessibility = scan.nextFloat();
		System.out.println("How many close is highway?");
		highwayAccessibility = scan.nextFloat();
		System.out.println("What's the rating of nearest school?");
		schoolScore = scan.nextFloat();
		System.out.println("Does any of your family members smoking?");
		smoking = scan.nextBoolean();
		System.out.println("Market report has been generated.");
		System.out.println("Enter  Statring Price:");

		propertyPrice = startingPrice + numberOfBedrooms * 30000;

		if (backyard) {
			propertyPrice = propertyPrice + 5000;
		}
		if (garage) {
			if (spots > 10) {

				System.out.println("Pardon, it's not a public parking");

			}else {
				propertyPrice = propertyPrice + 20000 * spots;
			}

		}
		

		if (metroAccessibility <= 1) {

			propertyPrice = propertyPrice + 10000;
		}
		if (metroAccessibility > 1 && metroAccessibility < 3) {
			propertyPrice = propertyPrice + 5000;
		}
		if (highwayAccessibility <= 1) {
			propertyPrice = propertyPrice + 15000;
		}
		if (highwayAccessibility > 1 && highwayAccessibility < 5) {
			propertyPrice = propertyPrice + 8000;
		}
		if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
			propertyPrice = propertyPrice + 4000;
		}
		if (schoolScore > 8 && schoolScore <= 10) {
			propertyPrice = propertyPrice + 45000;
		}
		if (schoolScore < 8 && schoolScore > 8 || schoolScore == 4) {
			
				propertyPrice = propertyPrice + 20000;
			} else {
				propertyPrice = propertyPrice + 5000;
			}
		
		if (smoking) {
			propertyPrice = propertyPrice - 5000;
		}
		System.out.println("Yout estimate market price is: " + propertyPrice + "$");

	}

}
