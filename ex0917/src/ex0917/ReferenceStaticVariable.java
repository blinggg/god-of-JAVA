package ex0917;

public class ReferenceStaticVariable {
	String name;
	public ReferenceStaticVariable() {}
	public ReferenceStaticVariable(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceStaticVariable reference=new ReferenceStaticVariable();
		reference.checkName();
	}
	
	public void checkName() {
		ReferenceStaticVariable r1=new ReferenceStaticVariable("zoom");
		System.out.println(r1.name);
		ReferenceStaticVariable r2=new ReferenceStaticVariable("¿°µû");
		System.out.println(r1.name);
	}

}
