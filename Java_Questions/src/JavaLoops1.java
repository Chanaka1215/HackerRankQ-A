import java.util.Scanner;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j =1;j<=10;j++){
            System.out.println(i +" x "+j +" = "+i*j);
        }
    }
}
