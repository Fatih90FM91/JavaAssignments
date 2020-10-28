package replit;

import java.util.Scanner;

public class methods1 {

	public static void main(String[] args) {
		 
		plus(2, 4);

	}
	  public static void plus(int num1,int num2){
		   Scanner scan=new Scanner(System.in) ; 
		    //your code here
		   System.out.println("enter first number:"); 
		   		
		  
		   num1=scan.nextInt();
		   System.out.println("enter second number:"); 
		  num2=scan.nextInt();
		  
		  int result =num1+num2;
		  System.out.println("result: "+result);
	  }
}
