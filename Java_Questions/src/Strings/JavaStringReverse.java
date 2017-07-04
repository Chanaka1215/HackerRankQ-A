/***
 * Given a string , print Yes if it is a palindrome, print No otherwise.

 Constraints

 will consist at most lower case english letters.

 Sample Input

 madam

 Sample Output

 Yes

 */


package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.print(isPalindrome(A));
    }
    private static String isPalindrome(String word) {
        int strLength = word.length();
        if (strLength > 50 || strLength < 0 || !Pattern.matches("[a-z]*", word) || word == null || "".equals(word)) {
            return "constrain checked please chaeck";
        }

        for (int i = 0; i < strLength / 2; i++) {
            if (word.charAt(i) != word.charAt(strLength - 1 - i)) {
                return "No";
            }
        }

        return "Yes";
    }

}
