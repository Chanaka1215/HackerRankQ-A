package Introduction;

import java.util.Scanner;

/***
 * Input Format

 There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

 Constraints

 Output Format

 If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

 Sample input 1

 1
 3

 Sample output 1

 3

 Sample input 2

 -1
 2

 Sample output 2

 java.lang.Exception: Breadth and height must be positive

 */

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */

public class JavaStaticInitializerBlock {
    static int H;
    static int B;
    static boolean flag= false;
    static {
        Scanner scan = new Scanner(System.in);
        B =scan.nextInt();
        H = scan.nextInt();
        if(B <=0 || H <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            flag = true;
        }
        scan.close();
    }
    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
