package ex0910;

public class ControlLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlLabel control=new ControlLabel();
		control.printTimesTable();
	}
	public void printTimesTable() {
		for(int a=2; a<10; a++) {
			for(int b=1; b<=10; b++) {
				if(a==4 || b==4) {
					break;
				}
				System.out.println("±¸±¸´Ü "+a+"*"+b+"="+a*b);
			}
		}
	}

}
