package ex0916;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	public MemberDTO(String name) {
		this.name=name;
		//매개 변수 안에 있는 name 이 아닌 "이 객체의 name"
	}
}
