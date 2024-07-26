package Arrays4;

import java.util.Scanner;

public class Assignment_2 {

    /*
    Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
    every positive number is followed by a negative and vice-versa maintaining the order of appearance.
    The number of positive and negative numbers need not be equal. Begin with a negative number.
    If there are more positive numbers, they appear at the end of the array. If there are more negative
    numbers, they too appear at the end of the array.

{1,2,3,-4,-7,-8,-9,-5}
-4 1 -7 2 -8 3 -9 -5

    Input 1:
    N = 6
    arr[] = {1, 2, 3, -4, -1, 4}
//          -4  1 -1   2   3  4
    Output 1:
    arr[] = {-4, 1, -1, 2, 3, 4}

    Input 2:
    N = 4
    arr[] = {1, 2, 3, -4}
    Output 2:
    arr[] = {-4, 1, 2, 3}
     */

    public static void main(String[] args) {
        Assignment_1 asg1 = new Assignment_1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

    }
}
