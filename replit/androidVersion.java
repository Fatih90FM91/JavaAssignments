package replit;
import java.util.*;
public class androidVersion {

	public static void main(String[] args) {
		
		 //WRITE YOUR CODE HERE
	    
	    //Step 1. Create object of Scanner class
	   Scanner scan =new Scanner(System.in);
	    //Step 2. Create and intitialize in variable version. Use scanner.nextDouble() to intitialize.
	  double version =scan.nextDouble();
	    //Step 3. Write an if statement
	    if(version==1.5){
	      
	      System.out.println("Cupcake");
	    }else if (version ==1.6){
	      System.out.println("Donut");
	    }else if (version ==2.1){
	      System.out.println("Eclair");
	    }else if (version ==2.2){
	      System.out.println("Froyo");
	    }else if (version ==2.3){
	      System.out.println("Gingerbread");
	    }else if (version ==3.1){
	      System.out.println("Honeycomb");
	    }else if (version ==4.0){
	      System.out.println("Ice Cream Sandwich");
	    }else if (version >=4.1 && version<=4.3){
	      System.out.println("Jelly Bean");
	    }else if (version ==4.4){
	      System.out.println("Kitkat");
	    }else if (version >=5.0 && version<=5.1){
	      System.out.println("Lollipop");
	    }else if (version >=8.0 && version<=8.1){
	      System.out.println("Orea");
	    }else if (version ==9.0){
	      System.out.println("Pie");
	    }else{
	      
	      
	      System.out.println("Sorry,I don't know this version!");
	    
	    }

	}

}
