import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(getConcatLength(A,B));
        CheckLexicographically(A,B);
        concatStrings(A,B);


    }

    private static void CheckLexicographically(String a, String b){
        char aFirst  =a.charAt(0);
        char bFirst = b.charAt(0);
        if(aFirst > bFirst)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static int getConcatLength(String a, String b){
        int length=0;
        length = a.length();
        length +=b.length();
        return length;
    }

    private static void concatStrings(String a, String b){
        a = a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase();
        b = b.substring(0,1).toUpperCase() +b.substring(1).toLowerCase();
        System.out.println( a+" "+b);
    }
}
