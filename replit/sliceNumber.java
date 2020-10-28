package replit;

import java.util.Scanner;

public class sliceNumber {

	public static void main(String[] args) {
		// DO NOT CHANGE
		int num, digit1, digit2, digit3, digit4, digit5;
		// WRITE YOUR CODE HERE

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number:");
		num = scan.nextInt();

		digit1 = num / 10000;// 1
		System.out.println(digit1);
		int num1 = num / 1000;// 12
		System.out.println();
		digit2 = num1 % 10;// 2
		System.out.println(digit2);
		int num2 = num / 100;// 123
		System.out.println();
		digit3 = num2 % 10;// 3
		System.out.println(digit3);
		int num3 = num / 10;// 1234
		System.out.println();
		digit4 = num3 % 10;// 4
		System.out.println(digit4);
		System.out.println();
		digit5 = num % 10;// 5
		System.out.println(digit5);

	}

}
