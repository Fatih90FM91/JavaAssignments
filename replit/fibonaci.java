package replit;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE
		int a1 = 0;
		int b1 = 1;
		int sum;
		for (int i = 1; i < num; i++) {

			sum = a1 + b1;
			a1 = b1;
			b1 = sum;

		}
		
		System.out.println(b1);

	}
}