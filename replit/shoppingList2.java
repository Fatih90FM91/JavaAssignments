package replit;

import java.util.*;

public class shoppingList2 {

	public static void main(String[] args) {

		double totalPrice = 0;
		String report;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Item1, count and its price:");
		String item1 = scan.next();

		int count1 = scan.nextInt();

		double price1 = scan.nextDouble();

		totalPrice = count1 * price1;
		report="Item1:"+item1+" price:" +  price1;

		System.out.println("Enter Item2, count and its price:");
		String item2 = scan.next();

		int count2 = scan.nextInt();

		double price2 = scan.nextDouble();
		System.out.println(report);
		if (count2 > 0) {

			totalPrice = totalPrice + count2 * price2;
			report="Item2:"+item2+" price:" +  price2;
		}
		

		System.out.println("Enter Item3, count and its price:");
		String item3 = scan.next();

		int count3 = scan.nextInt();

		double price3 = scan.nextDouble();
		System.out.println(report);
		if (count3 > 0) {

			totalPrice = totalPrice + count3 * price3;
			 report="Item3:"+item3+" price:" +  price3;
		}
		
		System.out.println(report);
		
		System.out.println("Total Price: " + totalPrice);

	}

}
