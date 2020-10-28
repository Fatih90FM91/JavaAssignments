package replit;

public class methodsProfitOrLoss {

	public static void main(String[] args) {
		
     
     System.out.println(c_profits(100, 50));
	}
	public static String c_profits (int buyPrice,int sellPrice)
	  {
	   if(buyPrice>sellPrice) {
		   return "loss";
	   }else if(sellPrice>buyPrice) {
		   return "profit";
	   }else {
		   return "no loss";
	   }
	   
	   
	   
	  }

}
