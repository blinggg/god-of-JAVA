package ex0911;

public class ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLotto array=new ArrayLotto();
		array.newFor();
		//array.init();
		
	}
	public void init() {
		int [] lottoNumbers=new int[7];
		lottoNumbers[0]=1;
		lottoNumbers[1]=22;
		lottoNumbers[2]=333;
		lottoNumbers[3]=4444;
		lottoNumbers[4]=55555;
		lottoNumbers[5]=666666;
		lottoNumbers[6]=7777777;
		lottoNumbers[7]=88888888;
		System.out.println(lottoNumbers);
	}
	
	public void newFor() {
		int[] oneDime=new int[] {1,2,3,4,5,6,7};
		for(int data:oneDime) {
			System.out.println(data);
		}
	}
}
