
public class arrayOutOfBoundsTryCatch {
	
	public static void main(String[] args) {
		int[] intArray=new int[5];
		try {
			System.out.println(intArray[5]);
			System.out.println("This code should run.");
		}catch(Exception e) {
			System.err.println("Exception occured.");
		}
			System.out.println("This code must run.");
	}
	
}

