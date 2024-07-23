/*
Write a Java method to display the middle character of a string.
Note:
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.

Input:
350
Output:
5

 */
package JavaMethods.Assignments;

import java.util.Scanner;

class MiddleChar{

    String displayMiddleCharacter(String s){
        if(s.length() % 2 ==0) return s.substring(s.length()/2-1,s.length()/2 + 1);
        else return s.substring(s.length()/2,s.length()/2 + 1);
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        MiddleChar mc = new MiddleChar();
        String result  =  mc.displayMiddleCharacter(str);
        System.out.println(result);
    }
}
