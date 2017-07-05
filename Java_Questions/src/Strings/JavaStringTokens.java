package Strings;

import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();         //take the inpust as a string
        s=s.trim();                         //remove leading and trailing whitespaces
        scan.close();                       //clase the Scanner instance

        if(s.length() ==0){                 //if the input string length is 0,then no tokens so print 0 (for test case#9)
            System.out.println(0);
        }else{                              //if string length is >0 do following
            String delimiters = "[ !,?._'@]+";   //split the string from these delemiters
            String[] tokens = s.split(delimiters);
            System.out.println(tokens.length);
            for(int i=0;i<tokens.length;i++){
                System.out.println(tokens[i]);
            }
        }
    }
}
