package replit;

public class methodsReturn {

	public static void main(String[] args) {
		
	int x=	max(3,8);
	System.out.println(x);

	}
	public static int max(int x,int max) {
		
		if(x<max) {
			return x;
		}else {
			return max;
		}
	}

}
