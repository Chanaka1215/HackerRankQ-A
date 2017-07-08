package Strings;


import java.util.*;
import java.util.regex.*;

/**
 * Created by Chanaka Fernando on 7/9/2017.
 */
public class JavaRegex3_UsernameChecker {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while (testCases > 0) {
                String username = in.nextLine();
                String pattern = "^[a-zA-Z]\\w{7,29}$";

                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(username);

                if (m.find()) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
                testCases--;
            }
        }

}


/**
 *
 * \^............... The beginning of a line
 \$............... The end of a line
 \w .............. A word character
 \X{n,m}..... X, at least n but not more than m times

 We need to place the \^ and \$ anchors at the beginning and ends of the String so that an invalid username with a valid username inside it doesn't get approved.

 The extra backslash in \w is to "escape" the 2nd backslash character in a Java String.
 */
