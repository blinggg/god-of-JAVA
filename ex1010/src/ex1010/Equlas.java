package ex1010;

public class Equlas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equlas Equlas=new Equlas();
		Equlas.equalMethod();
		
	}
	public void equalMethod() {
		MemberDTO obj1=new MemberDTO("����");
		MemberDTO obj2=new MemberDTO("����");
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		}else {
			System.out.println("obj1 and obj2 is different");
		}
	}
}
