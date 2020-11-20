import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(N+" * "+j+" = "+N*j);

			}
			break;
		}
		
		
	}

}
