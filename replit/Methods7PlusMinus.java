package replit;

import java.util.Scanner;

public class Methods7PlusMinus {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		        arr[i]=inp.nextInt();
		    }
		    
		    plus_minus(arr);

	}
	public static void plus_minus(int[] nums) {
		
		int countP=0,countN=0,countZ=0;
		
		for(int each:nums) {
			
			if(each>0) {
				countP++;
			}else if(each<0) {
				countN++;
			}else {
				countZ++;
			}
		}
		
		System.out.println("positives:"+countP+" negatives:"+countN+" zeros:"+countZ);
	}

}
