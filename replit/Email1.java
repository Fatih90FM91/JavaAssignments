package replit;

import java.util.Scanner;

public class Email1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    if(email.contains("_")) {
	    	
	    	String firstName,lastName;
	    	int underScore,atSign;
	    	
	    	underScore=email.indexOf("_");
	    	atSign=email.indexOf("@");
	    	
	    	firstName=email.substring(0, underScore);
	    	lastName=email.substring(underScore+1,atSign);
	    	System.out.println(lastName+"_"+firstName+"@gmail.com");
	    	
	    	
	    }else {
	    	System.out.println(email);
	    }

	}

}
