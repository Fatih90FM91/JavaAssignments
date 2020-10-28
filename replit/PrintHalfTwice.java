package replit;

import java.util.Scanner;

public class PrintHalfTwice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	   
	    for (int i = 0; i < 2; i++) {
	    	
	    		System.out.print(word.substring(0, word.length()/2));	
			
	    	
			
		}

	}

}
