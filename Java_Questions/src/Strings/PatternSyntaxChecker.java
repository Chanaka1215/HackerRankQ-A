package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i=0;i<testCases;i++){
            String pattern = scan.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
