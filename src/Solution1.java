import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int bb = A.length();
        bb = bb-1;
        int cc = (bb/2)+1;
        
        for (int i =0;i<= cc;i++){
        	if(A.length() == 1){System.out.println("Yes");System.exit(0);}
        	else if(A.charAt(i) == A.charAt(bb)){
        		bb--;
        		}else{System.out.println("No");System.exit(0);} 
        	}
        System.out.println("Yes");
    }
}
