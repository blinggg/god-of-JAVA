package ex0917;

public class ReferenceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReferenceStatic.staticMethod();
		ReferenceStatic.staticMethodCallVariable();
	}
	
	public static void staticMethod() {
		System.out.println("This is a staticMethod");
	}
	
	public static String name="Min";
	public static void staticMethodCallVariable() {
		System.out.println(name);
	}

}
