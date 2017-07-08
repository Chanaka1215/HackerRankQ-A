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