package Introduction; /***
 * You are given a date. Your task is to find what the day is on that date.

 Input Format

 A single line of input containing the space separated month, day and year, respectively, in format.

 Constraints

 Output Format

 Output the correct day in capital letters.

 Sample Input

 08 05 2015

 Sample Output

 WEDNESDAY

 Explanation

 The day on August 5th 20115 was WEDNESDAY.
 */

import java.time.LocalDate;
import java.util.*;

/**
 * Created by Chanaka Fernando on 7/4/2017.
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());


    }
}
