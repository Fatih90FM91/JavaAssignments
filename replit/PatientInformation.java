package replit;
import java.util.Scanner;
public class PatientInformation {

	public static void main(String[] args) {
		 //Enter your code here
	    
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    System.out.println("Enter your first name");
	    String firstName =scan.next();
	    
	    System.out.println("Enter your last name");
	    String lastName =scan.next();
	    System.out.println("Enter your last name");
	    String fullName =scan.next();
	    
	    
	   // this part is already provided DO NOT CHANGE
	        System.out.println("Enter your email");
	        String email = scan.next();
	        
	        System.out.println("Enter your street");
	        String street = scan.next();
	     // continue for city
	        System.out.println("Enter your state");
	     String state =scan.next();
	     
	     System.out.println("Enter your city");
	     String city =scan.next();
	     
	     System.out.println("Enter your work phone number");
	     String workPhoneNumber =scan.next();
	     
	     System.out.println("Enter your personal phone number");
	     String personalPhoneNumber =scan.next();
	     
	     System.out.println("Enter your zip code");
	     int zipcode =scan.nextInt();
	     
	     System.out.println("Enter your age");
	     int age =scan.nextInt();
	     
	     System.out.println("Enter your height");
	     double height=scan.nextInt();
	     
	     System.out.println("Enter your weight");
	     double weight =scan.nextInt();
	     
	     System.out.println("Are you married?");
	     boolean isMarried =true;
	     
	     System.out.println("patient personal information");
	     System.out.println("Full name: "+lastName+ ","+firstName);
	     System.out.println("Address: "+street+","+state+ ","+ city+ " "+zipcode);
	     System.out.println("Contacts:work phone number - "+workPhoneNumber+" personal phone number"+personalPhoneNumber+ ","+"email: "+email);
	     System.out.println("Age: "+age);
	     System.out.println("Height: "+height);
	     System.out.println("Weight: "+weight);
	     System.out.println("Are you married?" +isMarried);
	     
	}

}
