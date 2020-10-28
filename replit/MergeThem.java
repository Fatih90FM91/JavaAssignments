package replit;

import java.util.Scanner;

public class MergeThem {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    
		    int word1Lenght=word1.length();
		    int word2Lenght=word2.length();
		    
		    if(word1Lenght==3 && word2Lenght==3) {
		    	
		    	for (int i = 0; i < 3; i++) {
		    		
		    		System.out.print(""+word1.charAt(i)+word2.charAt(i));
					
				}
		    }else {
		    	System.out.println("cannot merge");
		    }

	}

}
