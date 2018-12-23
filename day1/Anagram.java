package day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Ana = "bcbaca";
		String AnaDataVerification = "cabacd";
		char[] AnaChar = Ana.toCharArray();
		Arrays.sort(AnaChar);
		//System.out.println(AnaChar);
		
		char[] AnaDataChar = AnaDataVerification.toCharArray();
		Arrays.sort(AnaDataChar);
		//System.out.println(AnaDataChar);
		int count = 0;
        if(AnaChar.length==AnaDataChar.length) {
        	for(int i = 0; i < AnaChar.length; i++) {
            	
    				if(AnaChar[i]==AnaDataChar[i]) {
    					
    					count++;
    				}else {
    		        	System.out.println("Not Anagram");

    					break;
    				}
    			
        		}
        }
        else {
        	System.out.println("Not Anagram");
        }
        
        if(count==AnaChar.length) {
        	System.out.println("String is anagram");
        }
        

	}

}
