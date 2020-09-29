package javapackage.sub;

public class AccessModifier {
	//누구나 접근 가능
	public void publicMethod() {
		
	}
	
	//같은패키지 or 상속
	protected void protectedMethod() {
		
	}
	//package - private (접근제어자X)
	void packagePrivateMethod() {
		
	}
	
	//해당클래스
	private void privateMethod() {
		
	}
}
