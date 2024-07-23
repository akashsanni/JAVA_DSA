package Arrays_Problems;

public class Min_And_Max_Value {

    static int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE; // -infinity
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondMaximum(int[] arr){
            int max = findMaximum(arr);
//            System.out.println(max);
            for(int i = 0 ; i < arr.length ; i++ ){
                if(arr[i] == max){
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            int secondMaximum = findMaximum(arr);
            return secondMaximum;
    }

    static int findMinimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMinimum(int[] arr){
        int min = findMinimum(arr);
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMinimum(arr);
        return secondMin;
    }

    public static void main(String[] args) {
        int a[]={1,3,2,-2,6,15,90,7};
        int b[]={1,3,2,-2,6,15,90,7};
        int result1 = findMaximum(a);
        int result2 = findMinimum(b);
        System.out.println("Maximum is: " + result1);
        System.out.println("Second Maximum is: " + findSecondMaximum(a));
        System.out.println("Minimum is: " + result2);
        System.out.println("Second Minimum is: " + findSecondMinimum(b));
    }
}

//There is a bug in the code...
/*
Update:
The bug has been removed
 */
