package Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    public static boolean isAnagram(String str1,String str2){
        boolean ans=false;
        if(str1 != null && str2 != null){
            char [] arrOfStr1 =str1.toUpperCase().toCharArray();
            char [] arrOfStr2 = str2.toUpperCase().toCharArray();
            Arrays.sort(arrOfStr1);
            Arrays.sort(arrOfStr2);
            if(Arrays.equals(arrOfStr1,arrOfStr2)){
                ans= true;
            }else {
                ans=false;
            }
        }

        return ans;
    }
}
