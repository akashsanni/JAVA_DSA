package JavaMethods;

import java.util.Scanner;

class Sum{
    public int sum(int a , int b){
        return a+b;
    }
}

public class SumOfTwoNumbersUsingMethodsinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Sum obj1 = new Sum();
        int result = obj1.sum(x1,y1);
        System.out.println("The sum of two numbers is " + result);
    }
}
