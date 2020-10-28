package replit;

import java.util.Scanner;

public class phoneNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// YOUR CODE HERE

		int areaCode = scan.nextInt();

		int localNumber = scan.nextInt();

		String phoneNumber = "(" + areaCode + ")-" + localNumber;

		System.out.println("Calling number " + phoneNumber);

	}

}
