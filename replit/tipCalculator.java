package replit;

import java.util.Scanner;

public class tipCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Split:");
		String split = scan.next();

		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();

		System.out.println("Check amount:");
		double amount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		double totalTip =0;

		double totalPay =0;
		double totalPerPerson =0;
		double tipPerPerson  =0;

		switch (serviceQuality) {

		case "Poor":
			totalTip = (amount / 100 * 5);
			totalPay = (totalTip + amount);
			totalPerPerson = (totalPay / numberOfPeople);
			tipPerPerson = (totalTip / numberOfPeople);
			break;
		case "Fair":
			totalTip = (amount / 100 * 10);
			totalPay = (totalTip + amount);
			totalPerPerson = (totalPay / numberOfPeople);
			tipPerPerson = (totalTip / numberOfPeople);
			break;
		case "Good":
			totalTip = (amount / 100 * 15);
			totalPay = (totalTip + amount);
			totalPerPerson = (totalPay / numberOfPeople);
			tipPerPerson = (totalTip / numberOfPeople);
			break;
		case "Great":
			totalTip = (amount / 100 * 20);
			totalPay = (totalTip + amount);
			totalPerPerson = (totalPay / numberOfPeople);
			tipPerPerson = (totalTip / numberOfPeople);
		case "Excellent":
			totalTip = (amount / 100 * 25);
			totalPay = (totalTip + amount);
			totalPerPerson = (totalPay / numberOfPeople);
			tipPerPerson = (totalTip / numberOfPeople);

		}

		System.out.println("Number of people entered: " + numberOfPeople);
		System.out.println("Total to pay:" + totalPay);
		System.out.println("Total tip:" + totalTip);
		System.out.println("Total per person:" + totalPerPerson);
		System.out.println("Tip per person:" + tipPerPerson);

	}

}
