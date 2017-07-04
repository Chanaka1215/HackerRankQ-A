/***
 * Input Format

 The first line contains a single string denoting .
 The second line contains two space-separated integers denoting the respective values of and .

 Constraints

 String consists of English alphabetic letters (i.e., ) only.

 Output Format

 Print the substring in the inclusive range from to .

 Sample Input

 Helloworld
 3 7

 Sample Output

 lowo

 Explanation

 In the diagram below, the substring is highlighted in green:

 substring.png
 */


package Strings;

import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        String subString = s.substring(start,end);
        System.out.println(subString);

    }
}
