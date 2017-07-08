package BigNumbers;

import com.sun.deploy.util.SyncAccess;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/9/2017.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bTot,bMul;
        BigInteger bNum1 =new BigInteger(sc.next());
        BigInteger bNum2 =new BigInteger(sc.next());

        bTot =bNum1.add(bNum2);
        bMul =bNum1.multiply(bNum2);

        System.out.println(bTot);
        System.out.println(bMul);




    }
}
