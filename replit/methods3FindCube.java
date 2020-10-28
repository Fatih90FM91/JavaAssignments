package replit;

import java.util.Scanner;

public class methods3FindCube {

	public static void main(String[] args) {
	
		cube(5);
	}
	
	public static void cube(int n) {
		
		Scanner scan=new Scanner(System.in);
		
		n=scan.nextInt();
		
		n=n*n*n;
		
		System.out.println(n);
	}

}
