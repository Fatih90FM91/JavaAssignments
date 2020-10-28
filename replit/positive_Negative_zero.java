package replit;

import java.util.Scanner;

public class positive_Negative_zero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter first number:");
	    int num1 = input.nextInt();
	    
	    System.out.println("Enter second number:");
	    int num2 = input.nextInt();
	    
	    System.out.println("Enter third number:");
	    int num3 = input.nextInt();
	   
	    //CODE HERE 
	    
	    
	    if (num1>num2 && num1<num3){
	      
	      System.out.println("Medium value is: " +num1);
	    }
	     if (num2>num1 && num2<num3){
	      
	      System.out.println("Medium value is: " +num2);
	    }
	     if (num3>num1 && num3<num2){
	      
	      System.out.println("Medium value is: " +num3);
	    }
	    
	}

}
