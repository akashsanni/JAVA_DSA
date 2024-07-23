package Arrays_Problems;

import java.util.Arrays;
import java.util.Scanner;
/*
Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
pair in the array whose absolute difference is exactly x.(n>1)
INput:
N = 5
Arr[] = [5,10,15,20,26]
x= 10
Output:
Yes
 */
class MissingNoFromFirst_N_Integers{
    int missingNumber(int[] arr,int size){
//        int n = 8 ; //size
//        int arr1[] = {1,2,4,6,7,8}; // array of size n-1
        Arrays.sort(arr);
        int number = 1;
        int missingNo = 0;
        for(int i=0; i<size-1; i++){
            if(arr[i] != number){
                missingNo =  number;
                return missingNo;
            }else if(arr[i] == number){
                number++;
            }
        }
    return missingNo;
    }
}
public class Assignments {

    static String isAbsoluteDiffExists(int[] arr, int x){
        String st = "No";
        for(int i = 0 ; i<arr.length; i++){
            for( int j = i + 1 ; j<arr.length; j++){
                if(arr[j] - arr[i] == x){
                    return "Yes";
                }
            }
        }
        return st;
    }

    public static void main(String[] args) {
        //Assignment 1
        int N = 7; //Size
        int arr[] = {1,2,3,4,5,6,7};
        int x = 0;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of the array");
//        int N = sc.nextInt();
//
//        int[] arr = new int[N];
//        System.out.println("Enter Array element: ");
//        for(int i = 0 ; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter an integer that is comparable to absolute difference");
//        int x = sc.nextInt();
        System.out.println("Assignment 1: ");

        String result = isAbsoluteDiffExists(arr,x);
        System.out.println(result);


        //Assignment 2
        int n = 8 ; //size
        int arr1[] = {6,7,2,3,4,5,8}; // array of size n-1

        MissingNoFromFirst_N_Integers missing = new MissingNoFromFirst_N_Integers();
        int result1 = missing.missingNumber(arr1,n);
        System.out.println("Assignment 2: ");
        System.out.println(result1);
    }
}
