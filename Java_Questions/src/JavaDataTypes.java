import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaDataTypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        double shortRange =Math.pow(2,15);
        double intRange =Math.pow(2,31);
        double longRange =Math.pow(2,63);
        //System.out.print(shortRange +" "+intRange+" "+longRange);



        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-shortRange && x <=shortRange-1)System.out.println("* short");
                if(x>=-intRange && x <=intRange-1)System.out.println("* int");
                if(x>=-longRange && x <=longRange-1)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
