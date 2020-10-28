package replit;

import java.util.Scanner;

public class MethodsTimeConversion {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		  }
		  
		  public static void timeConversion(String s) {
		   
			if(s.equals("12:00:00AM"))  {
				System.out.println("00:00:00");
			}else if(s.equals("12:00:00PM")){
				System.out.println("12:00:00");
			}else if(s.endsWith("AM")) {
				System.out.println(s.replace("AM",""));
			}else if(s.endsWith("PM")) {
				//input: 01:05:45PM
				//output: 19:05:45
				
				int hour =Integer.parseInt(s.substring(0,s.indexOf(":")));
				hour+=12;
				String newTime=hour+s.substring(s.indexOf(":")).replace("PM", "");
				System.out.println(newTime);
			}
				 
				 
		  }
		}