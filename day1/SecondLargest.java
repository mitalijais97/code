package day1;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,4,7,2,6,9,8};
	     int firstNumber = num[0];
	     int secondNumber = num[1];
	   
	     int temp;
	    for(int i =2;i<num.length;i++){
	    	if(num[1]<num[i] && num[i]>num[0]) {
	    		  temp = num[0];
	    	      num[0] = num[i];
	    	      num[i] = num[1];
	    	      num[1] = temp;
	    	}else if(num[1]<num[i] && num[i]<num[0]) {
	    		temp = num[1];
	    		num[1]=num[i];
	    		num[i] = temp;
	    	}
	    } 
	    System.out.println(num[0]);
	    System.out.println(num[1]);
	}

}
