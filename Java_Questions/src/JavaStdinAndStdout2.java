import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaStdinAndStdout2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\\n");

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();
        s += scan.nextLine();
        scan.close();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
