package BigNumbers;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Chanaka Fernando on 7/9/2017.
 */
public class JavaBigDecimal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
//        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
//            @Override
//            public int compare(String a1, String a2) {
//                //convert to big decimal inside comparator
//                //so permanent string values are never changed
//                //aka you only use the BigDecimal values to
//                //compare the strings!
//                BigDecimal a = new BigDecimal(a1);
//                BigDecimal b = new BigDecimal(a2);
//                return a.compareTo(b);
//            }
//        }));




//        Arrays.sort(s,0,n,Collections.reverseOrder());

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }
                BigDecimal o1bd = new BigDecimal(o1);
                BigDecimal o2bd = new BigDecimal(o2);
                return o2bd.compareTo(o1bd);
            }
        });


        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
