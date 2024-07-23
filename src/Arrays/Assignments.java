package Arrays;

import java.util.Arrays;
import java.util.Collections;

/*
1.Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
Leftmost and rightmost element cannot be a peak element.
 */
class Assignment1{
    void FindingPeakElement(){
        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        int peakElement = -1;
        for(int i =1 ;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                peakElement=arr[i];
                break;
            }
        }
        System.out.println(peakElement);
    }
    /*
    Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
    for calculating the minimum element.
     */
    void FindingMinElement(){

//        Integer[] arr = {2, -3, 5, 8, 1, 0, -4};
        /*
         using Collections.min() to
         find minimum element
         using only 1 line.
         */
//        int min = Collections.min(Arrays.asList(arr));
//        System.out.println(min);

        int[] arr = {2, -3, 5, -8, 1, 0, -4};
        int minimum = arr[0];
        for(int i = 1 ; i<arr.length-1; i++){
            minimum =  Math.min(arr[i],minimum);
        }
        System.out.println(minimum);
    }
}
public class Assignments {
    public static void main(String[] args) {
        Assignment1 ass1 = new Assignment1();
        ass1.FindingPeakElement();
        ass1.FindingMinElement();
    }
}
