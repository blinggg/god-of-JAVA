package ex1010;

public class FinalReferenceType {
	final MemberDTO dto=new MemberDTO();

	public static void main(String[] args) {
		FinalReferenceType referenceType=new FinalReferenceType();
		referenceType.checkDTO();
	}
	
	public void checkDTO() {
		System.out.println(dto);
		dto.name="Àº°»";
		System.out.println(dto.name);
		System.out.println(dto.email);
		System.out.println(dto.phone);
		
		}
	}

	
