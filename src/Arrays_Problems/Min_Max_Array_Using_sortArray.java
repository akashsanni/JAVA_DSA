package Arrays_Problems;

import java.util.Arrays;

public class Min_Max_Array_Using_sortArray {

//     void secondMaximum(int[] a){
//         int sortedArray = Arrays.sort(a);                    //There is a bug
//         return sortedArray;                                  //error: Required
                                                                //       type: int
                                                                //       Provided: void
//    }

    /*
    Update:
    I found bug
    =>  Arrays.sort has no return value. It sorts the contents parameter array (your arr variable)
        by changing their order in the original array.
     */

    static int secondMinimum(int[] a){
        Arrays.sort(a);
        int secondMin = a[1];
        return secondMin;
    }
    static int secondMaximum(int[] a){
        Arrays.sort(a);
        int secondMax = a[a.length-2];
        return secondMax;
    }

    public static void main(String[] args) {

        int a[]={1,3,2,-2,6,9,7};
        int result1 = secondMinimum(a);
        int result2 = secondMaximum(a);
        System.out.println(result1);
        System.out.println(result2);

    }
}
