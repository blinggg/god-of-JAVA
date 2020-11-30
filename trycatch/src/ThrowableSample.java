
public class ThrowableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowableSample sample=new ThrowableSample();
		//sample.throwable();
		sample.throwException(13);
	}
	
	public void throwable() {
		int[] intArray=new int[5];
		try {
			intArray=null;
			System.out.println(intArray[5]);
		}catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.toString());
			t.printStackTrace();
		}
	}

	public void throwException(int number) {
		try {
			if(number>12) {
				throw new Exception("Number is over than 12");
			}
			System.out.println("Number is"+number);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
