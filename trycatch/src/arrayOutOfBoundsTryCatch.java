
public class arrayOutOfBoundsTryCatch {
	
	public static void main(String[] args) {
		int[] intArray=null;
		try {
			intArray=new int[5];
			System.out.println(intArray[5]);
			
		}catch(Exception e) {
			System.out.println(intArray.length);
		}
			System.out.println("This code must run.");
	}
	
}

