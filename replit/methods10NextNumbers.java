package replit;

import java.util.Scanner;

public class methods10NextNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();
		next3(num);

	}

	public static void next3(int num) {

		for (int i = num; i <= (num + 3); i++) {

			System.out.print(i + " ");

		}
	}

}
