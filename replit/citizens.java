package replit;
import java.util.*;
public class citizens {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		
		int seniorCitizens =scan.nextInt();
		int nonSeniorCitizens =scan.nextInt();
		
		System.out.println("What is new citizen's age?");
		int age =scan.nextInt();
		
		if (age>=65) {
			
			seniorCitizens++;
			System.out.println("Senior Citizen");
		}
		if(age<65) {
			nonSeniorCitizens++;
			System.out.println("Non-Senior Citizen");
			
			
		}
		System.out.println("New seniorCitizens count "+seniorCitizens);
		System.out.println("New nonseniorCitizens count "+nonSeniorCitizens);

	}

}
