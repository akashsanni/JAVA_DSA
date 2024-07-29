package Arrays4;

import java.util.Scanner;

public class Assignment_1{

    static void printArray(int[] a){
        for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
    /*
    1.
    Given an array arr[] of size n, find the first repeating element. The element should occur more than
    once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
    (assume 1 based indexing)
    Input 1:
    n = 7
    arr[] = {1, 5, 3, 4, 3, 5, 6}
    Output 1:
    2

    Input 2:
    n = 4
    arr[] = {2, 5, 3, 4}
    Output 2:
    -1
     */
    static int firstRepeatingElement(int[] arr){
        int index = -1;

        for(int i = 0 ; i<arr.length; i++){
            for(int j = i +1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    index = i + 1;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i=0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("index of its first repeating element (1-based indexing): ");
        System.out.println(firstRepeatingElement(arr));

    }
}
