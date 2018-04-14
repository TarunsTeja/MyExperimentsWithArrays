import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HacRank {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        int temp,min,max;  
 		int sum =0;
 		int sum1 =0,xy;
 		int sumelements[]=new int[5];
		for (int i =0;i<=4;i++){
			xy = arr[i];
			int plus =0;
			for(int k=0;k<=4;k++){
				
				if (arr[k]==xy){
					continue;
				}else{
					plus=plus+arr[k];
					}
			}
		sumelements[i]=plus;
		}
		
		/*for(int i=0;i<sumelements.length;i++)
			System.out.println(sumelements[i]);  */
 		   
		//code for min number in array
		 min = sumelements[0];
        for (int i = 1; i < sumelements.length; i++) {
            if (sumelements[i] < min) {
                min = sumelements[i];
            }
        }
       // System.out.println("*******************");  
    //   System.out.println("Minimum  "+min); 
        
        //Code for max number in array
        max = sumelements[0];
        for (int i = 1; i < sumelements.length; i++) {
            if (sumelements[i] > max) {
                max = sumelements[i];
            } 
        }
      //  System.out.println("*******************");  
        System.out.println(min+"	"+max);  
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }
        miniMaxSum(arr);
    }
}
