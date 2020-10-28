package replit;

import java.util.Scanner;

public class burgerOrChicken {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		    
		    
		    String in = s.next();
		    
		    //your code here
		    float a =10.0f;
		    float b=2.0f;
		    if(in.equals("burger") || in.equals("chicken") ) {
		    	
		    	System.out.println(a);
		    }else if (in.equals("soda")) {
		    	System.out.println(b);
		    }


	}

}
