package BasicsOfJava;

import java.util.Scanner;

public class DecimalToBinaryConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0; //binary no
        int pw = 1;  //Powers of 10
        while(num>0){

            int parity = num % 2 ;
            ans += (parity * pw);
            pw = pw * 10;
            num=num/2;

        }
        System.out.println(ans);
    }
}
