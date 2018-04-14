import java.io.*;
import java.util.*;


public class Solution2 {
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	       String ret = isAnagram(a, b);
	        //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    
 isAnagram(String a, String b) {
	        // Complete the function
	        HashMap<Integer,String> string1=new HashMap<Integer,String>(); 
	        for(int i = 0;i<=a.length();i++){
	        	String aa = Character.toString(a.charAt(i));
	            string1.put(1,aa);
	            
	                }
	        for (Map.Entry m:string1.entrySet()){
	        	System.out.println(m.getKey()+" "+m.getValue());
	        }
 } 
	    }

	private static String isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		return null;
	}	
}


