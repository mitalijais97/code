package day2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 11;
	        boolean b = true;
	        for(int i = 2; i < num/2 ; i++) {
	        	int remainder = num%i;
	        	if(remainder==0) {
	        		b = false;
	        		break;
	        	}
	        }
	        if(b==false) {
	        	System.out.println("number is not prime");
	        }else {
	        	System.out.println("number is prime");

	        }
	}

}
