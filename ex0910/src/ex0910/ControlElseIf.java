package ex0910;

public class ControlElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlElseIf control=new ControlElseIf();
		control.elseIf(70);
	}

	public void elseIf(int point) {
		if(point>90) {
			System.out.println("A");
		}else if(point<=90 && point>80) {
			System.out.println("B");
		}else if(point<=80 && point>70) {
			System.out.println("C");
		}else if(point<=70 && point>60) {
			System.out.println("D");
		}if(point<=60) {
			System.out.println("F");
		}
	}
}
