package Conditionals;

import java.util.Scanner;

public class conditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Logical AND operator &&
        //Logical OR operator ||
        //Ternary Operator  ?:
        int num = sc.nextInt();
        String ans;
        ans = (num % 2 == 0) ?"even":"odd";
        System.out.println(ans);
    }
}
