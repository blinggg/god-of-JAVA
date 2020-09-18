package ex0918;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		//System.out.println("강한친구 대한육군");
		//System.out.println("강한친구 대한육군");

		Scanner scanner=new Scanner(System.in);
		
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
