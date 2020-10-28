package replit;

public class methodsReturnHamletLogic {

	public static void main(String[] args) {
		boolean x = hamletQuote(false, false);
		System.out.println(x);
	}

	public static boolean hamletQuote(boolean toBe, boolean notToBe) {

		if (toBe == true || notToBe == false) {
			return true;
		} else if (toBe == false || notToBe == true) {
			return true;

		} else if (toBe == true || notToBe == true) {
			return true;
		} else  {
			return false;

		} 

	}

}
