package ex0916;

public class Overloading {
	public static void main(String[] args) {
		Overloading OVER=new Overloading();
		
	}
	
	public void print(int data) {
		
	}
	
	public void print(String data) {
		
	}
	
	public void print(int intData, String stringData) {
		
	}
	
	public void print(String stringData, int intData) {
		
	}
	
	public class Return{
		public int calculate() {
			int returnInt=0;
			if(returnInt==0) {
				return returnInt++;
			}
			return --returnInt;
		}
	}
}
