package replit;

import java.util.Scanner;

public class factoriel {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    long facto=1;
		    for (int i = 1; i <= n; i++) {
		    	
				facto=facto*i;
				
			}
		    System.out.println(facto);

	}

}
