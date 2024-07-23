/*
1.Write a Java method to compute the average of three numbers
Input1:
25
45
65
Output1:
45

Input2:
25
25
25
Output2:
25

2.Write a Java method to count all vowels in a string

Input1:(consists of all lowercase letters)
coding
Output1:
2

Input2:(consists of all lowercase letters)
heaps
Output2:
2

 */

package JavaMethods.Assignments;

import java.util.Scanner;
class Counter{
    int countAllVowels(String st){
        /*
        Converting String to Array and then trying...
         */
//        int count = 0;
//        char[] charArray = st.toCharArray();
//        for(int i =0 ;i<charArray.length;i++){
//            char ch = charArray[i];
////            if (charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u'){
////                count++;
////            }
//            count = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? count+1 : count;
//
//        }
//        return count;

         /*
        Without Converting String to Array...
         */
        int count = 0;
        for(int i =0 ;i<st.length();i++){
            char ch = st.charAt(i);
//            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
//                count++;
//            }
            count = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? count+1 : count;

        }
        return count;

    }
}
class Avg{
    double calcultateAverage(double a,double b,double c){
        return (a+b+c)/3;
    }
}
public class Assgn {
    public static void main(String[] args) {
//        Avg obj1 = new Avg();
        Scanner sc = new Scanner(System.in);
        //Assignment 1
//        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
//        double result1 = obj1.calcultateAverage(x,y,z);
//        System.out.println(result1);

        //Assignment 2
        String str = sc.nextLine();
        Counter obj2 = new Counter();
        int result2 = obj2.countAllVowels(str);
        System.out.println(result2);
    }
}
