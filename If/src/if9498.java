import java.util.Scanner;

public class if9498 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int A=scanner.nextInt();
		
		
		/*
		 * do { A=scanner.nextInt(); System.out.println("���������� �ٽ� �Է��ϼ���"); }while(A<0 ||
		 * A>100);
		 */
		
		if(A>=90&&A<=100) {
			System.out.println("A");
		}else if(A>=80&&A<=89) {
			System.out.println("B");
		}else if(A>=70&&A<=79){
			System.out.println("C");
		}
		else if(A>=60&&A<=69){
			System.out.println("D");
		}else System.out.println("F");
	}
}
