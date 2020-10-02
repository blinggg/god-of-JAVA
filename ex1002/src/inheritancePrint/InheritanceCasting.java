package inheritancePrint;

public class InheritanceCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceCasting inheri=new InheritanceCasting();
		inheri.objectCastArray();
	}
	
		public void objectCastArray() {
			ParentCasting [] parentArray=new ParentCasting[3];
			parentArray[0]=new ChildCasting();
			parentArray[1]=new ParentCasting();
			parentArray[2]=new ChildCasting();
			objectTypeCheck(parentArray);
			
		}
		
		private void objectTypeCheck(ParentCasting[] parentArray) {
			for(ParentCasting tempParent : parentArray) {
				if(tempParent instanceof ChildCasting) {
					System.out.println("childCasting");
				}else if(tempParent instanceof ParentCasting){
					System.out.println("ParentCasting");
				}
			}
		}
	}

