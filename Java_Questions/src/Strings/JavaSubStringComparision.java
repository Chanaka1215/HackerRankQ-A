/***
 * Input Format

 The first line contains a string denoting .
 The second line contains an integer denoting .

 Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).

 Output Format

 Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

 Sample Input 0

 welcometojava
 3

 Sample Output 0

 ava
 wel

 Explanation 0

 String has the following lexicographically-ordered substrings of length :

 We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

 The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 */


package Strings;

import java.util.*;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaSubStringComparision {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }
}
