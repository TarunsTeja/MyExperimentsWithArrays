import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Fizz {
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
        int x1;
        x1 = Integer.parseInt(in.nextLine().trim());

        int y1;
        y1 = Integer.parseInt(in.nextLine().trim());

        int x2;
        x2 = Integer.parseInt(in.nextLine().trim());

        int y2;
        y2 = Integer.parseInt(in.nextLine().trim());

        res = canReach(x1, y1, x2, y2);
        bw.write(res);
        bw.newLine();

        bw.close();
    }

static String canReach(int x1, int y1, int x2, int y2) {
	String a = "Yes";
	String b = "No";
	int x = x1+y1;
	if (x == x2){
		int y = x+y1;
		if(x==x2 && y ==y2){
			return a;
		}
		else{
			return b;	
		}
	}
	return b;
}
}
