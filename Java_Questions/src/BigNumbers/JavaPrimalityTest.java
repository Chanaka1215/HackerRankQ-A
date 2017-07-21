package BigNumbers;

/**
 * Created by       : Chanaka Fernando.
 * Date             : Fri, 7/21/2017 .
 * Email            : nuwan.c.fernando@gmail.com.
 * LinkedIn         : https://www.linkedin.com/in/n-chanaka-fernando
 * Blongs to Project: Java_Questions.
 * Package          : BigNumbers.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        boolean ans = n.isProbablePrime(5);
        if(ans){
            System.out.println("Prime");
        }else {
            System.out.println("Not a prime");
        }


    }
}

