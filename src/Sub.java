import java.text.DecimalFormat;
import java.util.Scanner;


public class Sub {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
       int i=0;
       String pay = Double.toString(payment);
       /*  String[] parts = pay.split("\\.");
        String part1 = parts[0]; 
        String part2 = parts[1];
       if(part1.length()<=3 && part2.length()<2){
       
    	   System.out.println(part1+"."+part2.charAt(0));//+part2.charAt(1));
       
} else  if(part1.length()<=3 && part2.length()>=2){
	System.out.println(part1+"."+part2.charAt(0)+part2.charAt(1));
}
       String number = "1000500000.574";*/
       double amount = Double.parseDouble(pay);
       DecimalFormat formatter = new DecimalFormat("#,###.00");
       System.out.println(formatter.format(amount));
}
}
