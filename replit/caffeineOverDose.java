package replit;

import java.util.Scanner;

public class caffeineOverDose {

	public static void main(String[] args) {
		System.out.println("Enter number of milligrams in drink:");
		Scanner scan=new Scanner(System.in);
		
	    int mgram =scan.nextInt();
	    int overdose =10*1000/mgram;
	    
	    System.out.println("It would take about "+overdose+ " drinks for a lethal overdose.");
	    
	    
	
	    

	}

}
