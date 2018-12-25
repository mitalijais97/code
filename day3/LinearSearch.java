package day3;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] linearData = {4,3,5,8,7,10,9,6};
       int searchData = 9;
       boolean found = false;
       for(int i = 0; i < linearData.length; i++) {
    	   if(searchData == linearData[i]) {
    		   int searchDataPossition = i+1;
    		   System.out.println("Index of search data is "+searchDataPossition);
    		   found = true;
    		   break;
    	   }
    	   
       }
       if(found==false) {
		   System.out.println("Index of search data is Not Found");
       }
	}

}
