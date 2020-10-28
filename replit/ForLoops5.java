package replit;

import java.util.Scanner;

public class ForLoops5 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    String vowels ="aeiou";
	    for (int i = 0; i <= word.length()-1; i++) {
	    	for (int j = 0; j <5; j++) {
	    		
				if(word.charAt(i)==vowels.charAt(j)) {
					System.out.print(word.charAt(i));
					
				}
			}
	    
	    	
	  

		}
	    
	}

}
