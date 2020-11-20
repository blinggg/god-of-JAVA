import java.util.Scanner;

public class FourRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사칙연산
		
		Scanner scan=new Scanner(System.in);
		
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		
		/*
		 * System.out.println(a+b); System.out.println(a-b); System.out.println(a*b);
		 * System.out.println(a/b); System.out.println(a%b);
		 */
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println (((A%C) * (B%C))%C);


	}
}
