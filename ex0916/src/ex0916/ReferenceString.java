package ex0916;

public class ReferenceString {
	//�ν��Ͻ� ����
	String instanceVariable;
	
	//������ ����
	public ReferenceString() {}
	public ReferenceString(String arg) {}
	
	//�޼ҵ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceString reference =new ReferenceString();
		
	}
	
	public String getString() {
		return instanceVariable;
	}
	
	public void setString(String str) {
		instanceVariable=str;
	}
}
