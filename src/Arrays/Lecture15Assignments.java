package Arrays;

import java.util.Scanner;

/*
Given an unsorted array arr[] of size N having both negative and positive integers, place
all negative elements at the end of array without changing the order of positive elements
and negative elements.
Inputs:
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Outputs:
1 3 2 11 6 -1 -7 -5
Inputs:
N = 4
arr[] = {-3, -1, 0, -7}
Outputs:
0 -3 -1 -7

*/
public class Lecture15Assignments {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("“Enter the length of array: ”");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;
        for(int i =0;i<n;i++){
            if(arr[i]>=0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        for(int i = 0 ;i<n;i++){
            if(arr[i]<0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        for(int i = 0; i<n;i++){
            System.out.print(ans[i] + " ");

        }
    }
}
