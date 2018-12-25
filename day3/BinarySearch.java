package day3;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,7,9,10,11,13,14};
		int num =13;
		int start =0;
		int end = arr.length-1;
		int mid;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==num) {
				System.out.println("Number found "+arr[mid]);
				System.out.println("Possition of number "+arr[mid]+" is "+mid);
				start++;
			}else if(arr[mid] < num) {
				start =mid+1;
			}else if(arr[mid] > num) {
				end = mid-1;
			}else {
				
			}
		}
		
		
		
	}

}
