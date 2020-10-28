package replit;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
	
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    
	    int longWord1=word1.length();
	    int longWord2=word2.length();
	    
	    if(longWord1>longWord2) {
	    	
	    	System.out.println(word1);
	    }else {
	    	System.out.println(word2);
	    }

	}

}
