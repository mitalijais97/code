package day2;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =3224;
		int num2 =3556;
		int divider;
		int divident;
		if(num1<num2){
		divider=num1;
		divident=num2;
		}else{
		divider=num2;
		divident=num1;
		}
        int temp;
        
		int remainder = divident%divider;
		while(remainder<divider) {
			temp=divider;
			divider=remainder;
			divident=temp;
			remainder = divident%divider;
			if(remainder==0) {
				System.out.println("HCF is "+divider);
				break;
			}
		}


	}

}
