import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        //double amount =200.0;
        //Give Indian rupees it will print in country specific currency format
        String us = (NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payment));
        String china =  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        String pay = Double.toString(payment);
        double amount = Double.parseDouble(pay);
        DecimalFormat formatter = new DecimalFormat("#,###.00");
       String india = formatter.format(amount);
                
        
        System.out.println("US: " + us);
        System.out.println("India: Rs."+india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
