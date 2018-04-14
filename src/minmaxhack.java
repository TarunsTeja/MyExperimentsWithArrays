import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class minmaxhack {

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
		
		for(int i=0;i<sumelements.length;i++)
			System.out.println(sumelements[i]);  
 		for (int i = 0; i < 5; i++)   
 		        {  
 		            for (int j = i + 1; j < 5; j++)   
 		            {  
 		                if (sumelements[i] > sumelements[j])   
 		                {  
 		                    temp = sumelements[i];  
 		                   sumelements[i] = sumelements[j];  
 		                  sumelements[j] = temp;  
 		                }  
 		            }  
 		        }  
 		min = sumelements[0];
 		
 		for(int i =0;i <arr.length;i++){
 			
 			if(sumelements[i] != min){
 			sum = sum+sumelements[i];}
 		}
         //Over writing sum to min variable
         min=sum;
      /*   //Code for Maximum
 		for (int i = 0; i < 5; i++)   
         {  
             for (int j = i + 1; j < 5; j++)   
             {  
                 if (sumelements[i] < sumelements[j])   
                 {  
                     temp = sumelements[i];  
                     sumelements[i] = sumelements[j];  
                     sumelements[j] = temp;  
                 }  
             }  
         } 
 max = sumelements[0];
 for(int i =0;i <arr.length;i++){
 	
 	if(sumelements[i] != max){
 	sum1 = sum1+sumelements[i];}
 }max=sum1;
 //miniMaxSum[0]=min;
 //miniMaxSum[1]=max;       
         //miniMaxSum(arr);
 
 System.out.println(min);
 System.out.println(max);

  */  }

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
