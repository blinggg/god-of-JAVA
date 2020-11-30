
public class finallySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finallySample sample=new finallySample();
		sample.FinallySample();
		
	}
	
	public void FinallySample() {
		int[] intArray=new int[5];
		try {
			System.out.println(intArray[4]);
		}catch(Exception e){
			System.out.println(intArray.length);
		}finally {
			System.out.println("Here is finally");
		}
		System.out.println("This code must run.");
	}

}
