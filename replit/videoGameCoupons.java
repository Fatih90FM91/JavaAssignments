package replit;
import java.util.*;
public class videoGameCoupons {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number of coupons:");
		  
		  int couponNum=scan.nextInt();
		  
		  int candyBar =couponNum/10;
		  int candyBarRest =couponNum%10;
		  int gumball =candyBarRest/3;
		  
		  if(couponNum<3) {
			  System.out.println("Not enough coupons");
		  }else {
		  
		  System.out.println("Number of Candies: "+candyBar);
		  System.out.println("Number of Gumballs: "+gumball);
		  }


	}

}
