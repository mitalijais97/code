package day3;

public class ArraySort {

	public static void main(String[] args) {
		int[] unsort = {4,3,5,8,6,2,7,10,9};
		for(int i = 0; i < unsort.length-1; i++) {
			if(unsort[i]>unsort[i+1]) {
				int temp = unsort[i];
				unsort[i] = unsort[i+1];
				unsort[i+1] = temp;
			}
			
			System.out.println(unsort[i]);
		}
		

	}

}
