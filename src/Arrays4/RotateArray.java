package Arrays4;

import java.util.Arrays;
import java.util.Scanner;

class RotateClass{
//    int[] Rotate(int[] arr, int k){
//        int n = arr.length;
//        k = k % n;
//        System.out.println(k);
//        int[] ans = new int[n];
//        int j = 0;
//        //arr -> (n-k) to (n-1)
//        //put (n-k)th position array to
//        //0th position in ans[]
//        for(int i = n-k ; i < n ; i++){
//            ans[j++] = arr[i];
//        }
//        //arr -> [0 to n-k-1]
//        //put 0th position array to
//        //(n-k-1)th position in ans[]
//        for(int i = 0; i < n-k ; i++){
//            ans[j++] = arr[i];
//        }
//
//        return ans;
//    }



}

public class RotateArray {
    static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void swapArrayNos(int[] arr,int i, int j){
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void ArrayReverse(int[] arr, int i, int j){     // i=>start  j=>end
        while(i < j){
            swapArrayNos(arr,i,j);
            i++;
            j--;
        }
    }
//                         0 1 2 3 4 5
    //        int arr[] = {1,2,3,4,5,6};
//                         1,2,  3,4,5,6
//                         2,1   6,5,4,3
//                         3,4,5,6,1,2
//                         3,4,5,6,1,2
//        int n = 6, k = 4;
    int[] rotateArrayInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        ArrayReverse(arr,0,n-k-1);
        ArrayReverse(arr,n-k,n-1);
        ArrayReverse(arr,0,n-1);
        return arr;

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of the array: ");
//        int m = sc.nextInt();
//        int[] arr = new int[m];
//        System.out.println("Enter Array elements: ");
//        for(int i = 0; i < m; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter no. of times you want to rotate array: ");
//        int k = sc.nextInt();

        //taken these for easy testing with diff use-cases
        int arr[] = {1,2,3,4,5,6};
        int k = 5;

        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("\n" + "Rotated Array: " + k + "times" );
        RotateClass obj = new RotateClass();
        RotateArray ra = new RotateArray();
//        int ans[] = obj.Rotate(arr,k);
        ra.rotateArrayInPlace(arr,k);
        printArray(arr);

    }
}
