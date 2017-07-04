package Introduction;

import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double result=a;
            for(int loop=0;loop < n;loop++){
                double power =Math.pow(2,loop);
                result += b*power ;
                System.out.print((int)result+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
