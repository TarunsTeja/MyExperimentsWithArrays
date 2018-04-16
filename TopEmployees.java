import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TopEmployees {

    // Complete the averageOfTopEmployees function below.
    static void averageOfTopEmployees(int[] rating) {
    	final DecimalFormat df2 = new DecimalFormat(".#'0'");
    	int[] subrating = new int[rating.length];
    	int count =0;
    	float avg;
    	float sum=0;
    		for (int i =0;i<=rating.length-1;i++){
    			if(rating[i]>=90){
    				subrating[i]=rating[i];
    				count++;
    			}
    		}
    		for (int i =0;i<=subrating.length-1;i++){
    			sum =sum+subrating[i];
    		}
    		avg = sum/count;
    		//float lm = (float) Math.round(avg * 100) / 100;
    		System.out.println(df2.format(avg));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[n];

        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
            int ratingItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            rating[ratingItr] = ratingItem;
        }

        averageOfTopEmployees(rating);

        scanner.close();
    }
}
