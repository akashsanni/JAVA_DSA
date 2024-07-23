/*
Write a Java method to check whether a year (integer) entered by the user is a leap year
or not.
Input1:
2017
Output1:
False

Input2:
2022
Output2:
False

 */
package JavaMethods.Assignments;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year: " );
        int year = scn.nextInt();
        System.out.print(is_LeapYear(year));
    }
    public static boolean is_LeapYear(int y){
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));
        return a && (b || c);
    }
}

/*
The rules for determining if a year is a leap year are as follows:
If a year is evenly divisible by 4, 100, and 400,
then it is a leap year. If a year is divisible by 4 but not by 100 and not divisible by 400,
then it is also a leap year.
 */
