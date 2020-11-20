import java.util.Scanner;

public class For10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A+B
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
