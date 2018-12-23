package day2;

public class Armstrong {

	public static void main(String[] args) {
		int num =153;
		int originalNumber = num;
		int checkArm = 0;
		while(num>0) {
			int remainder =num%10;
			checkArm = checkArm + remainder*remainder*remainder;
			num = num/10;
		}
		if(checkArm==originalNumber) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}

	}

}
