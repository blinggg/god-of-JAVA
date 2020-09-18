package ex0911;

public class ArrayInitValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInitValue array= new ArrayInitValue();
		array.referenceTypeValue();
	}
	public void referenceTypeValue() {
		String [] strings = new String[2];
		ArrayInitValue [] array= new ArrayInitValue[2];
		strings[0]="개발자 정은경";
		array[0]=new ArrayInitValue();
		System.out.println("strings[0]="+strings[0]);
		System.out.println("strings[1]="+strings[1]);
		System.out.println("array[0]="+array[0]);
		System.out.println("array[1]="+array[1]);
	}
}
