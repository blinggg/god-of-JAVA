import java.util.Scanner;

public class Gop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int temp = B;
		
		while(temp > 0) {
			System.out.println(A * (temp%10));
			System.out.println("temp="+(A * (temp%10)));
			temp /= 10;
			System.out.println("temp="+temp);
		}
		System.out.println(A*B);
	}
}
	

