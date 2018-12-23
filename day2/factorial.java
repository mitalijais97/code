package day2;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int fact = 1;
		fact = fact*num;
		for(int i =1;i<num;i++) {
			int temp = num-i;
			fact = fact*temp;
		}
        System.out.println(fact);
	}

}
