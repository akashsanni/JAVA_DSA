package Arrays;

import java.util.Arrays;

public class CopyingOfArray {

    static void changeArray(int[] arr){
        arr[2]=-1;
        arr[3]=-1;
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //declaration of array
        int[] arr1 = new int[5];
        arr1[0]=5;
        arr1[1]=6;
        arr1[2]=7;
        arr1[3]=8;
        arr1[4]=9;

        printArray(arr1);

        //shallow copy of arr1 => copying the reference of the array
//                                present in the stack memory and referencing
//                                it to the heap memory
//        int[] arr2 = arr1;
//        arr2[0]=0;
//        arr2[1]=0;
//        System.out.println("arr1 elements after copying the value");
//        printArray(arr1);
//        System.out.println("arr2 elements after copying the value");
//        printArray(arr2);

//        int[] arr2 = arr1;
//        changeArray(arr2);
//
//        System.out.println("arr1 elements after changing value using method calls");
//        printArray(arr1);
//        System.out.println("arr2 elements after changing value using method calls");
//        printArray(arr2);

        //Deep Copy of array=> will create diff address of diff arrays in the heap
//                              and in stack diff array will be referencing to the
//                              diff addresses.
//        int[] arr2 = arr1.clone(); //clone() method
//        int[] arr2 = Arrays.copyOf(arr1,arr1.length-1); //Arrays.copyOf(arrayName,newLength)  method
        int[] arr2 = Arrays.copyOfRange(arr1,0,3); //copyOfRange() method {to is not included (third parameter)}

        arr2[0]=0;
        arr2[1]=0;
        System.out.println("arr1 elements after changing value using method calls");
        printArray(arr1);
        System.out.println("arr2 elements after changing value using method calls");
        printArray(arr2);


    }
}
