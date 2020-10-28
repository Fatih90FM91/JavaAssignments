package replit;

import java.util.Scanner;

public class ReverseIt {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    int wordLenght=word.length();
		    
		    if(wordLenght>5) {
		    	System.out.println("Too long!");
		    }else if(wordLenght<5) {
		    	System.out.println("Too short!");
		    }else {
		    	
		    	for (int i =word.length()-1 ; i >=0; i--) {
		    		
		    		System.out.print(word.charAt(i));
					
				}
		    }

	}

}
