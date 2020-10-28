package replit;

import java.util.Scanner;

public class FindTheLenght {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the text:");
		
		String text=scn.nextLine();
		
		System.out.println("Length is:"+text.length());

	}

}
