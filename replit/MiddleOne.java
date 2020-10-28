package replit;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    
		    int lenghtOfNumber=word.length();
		    
		    if(lenghtOfNumber%2!=0) {
		    	
		    	if(lenghtOfNumber>=3) {
		    		
		    		System.out.println(word.charAt(word.length()/2));
		    		
		    	}else if(lenghtOfNumber==1) {
		    		for (int i = 0; i < 3; i++) {
		    			System.out.print(""+word.charAt(0));
						
					}
		    	}
		    }else if(lenghtOfNumber>=4){
		    	
		    	System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2));
		    }else if(lenghtOfNumber==2) {
		    	for (int i = 0; i < 2; i++) {
		    		System.out.print(""+word.charAt(0)+word.charAt(1));
					
				}
		    }
	}

}
