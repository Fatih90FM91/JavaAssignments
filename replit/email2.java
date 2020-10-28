package replit;

import java.util.Scanner;

public class email2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    String firtName,lastName,domain,topLevelDomain;
		    int underScore,atSign,pointSign;
		    underScore=email.indexOf("_");
		    atSign=email.indexOf("@");
		    pointSign=email.indexOf(".");
		    firtName=email.substring(0, underScore);
		    firtName=firtName.substring(0, 1).toUpperCase()+firtName.substring(1);
		    
		    lastName=email.substring(underScore+1, atSign);
		    lastName=lastName.substring(0, 1).toUpperCase()+lastName.substring(1);
		    domain=email.substring(atSign+1, pointSign);
		    topLevelDomain=email.substring(pointSign+1,email.length() );
		    
		   
		    
		    System.out.println("First name: "+firtName) ;
		    System.out.println("Last name: "+ lastName);
		    System.out.println("Domain: "+domain);
		    System.out.println("Top-Level Domain: "+topLevelDomain);
	}

}
