package Arrays4;

public class Lecture18{

    static void printArray(int[] a){
        for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
    void swapTwoNumbers(int a, int b){
        System.out.println("Before Swapping a = " + a);
        System.out.println("Before Swapping b = " + b);
        a = a + b; // a = 15
        b = a - b; // b = 15-5 = 10
        a = a - b; // a = 15-10 = 5
        System.out.println("\n"+"After Swapping a = " + a);
        System.out.println("After Swapping b = " + b);
    }
    void swapArrayNos(int[] arr,int i, int j){
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Mera logic
    static int[] reverseOfArray(int[] arr){
        int m = arr.length;
//        int ans[]= new int[m];
        int n = arr.length;
        int temp = 0; //1
//        {1,2,3,4,5,6}
        for(int i = 0 ; i < m ; i++){
            if(m%2 != 0){
                if(n == m/2+1){
                    return arr;
                }
                temp = arr[i];
                arr[i] = arr[n-1];
                arr[n-1] = temp;
                n--;
            }else {
                if(i+1 > m/2){
                    return arr;
                }
                temp = arr[i];
                arr[i] = arr[n-1];
                arr[n-1] = temp;
                n--;
            }

        }
        return arr;

    }


    void ArrayReverse(int [] arr){
        int i = 0 , j = arr.length-1;
        while(i < j){
            swapArrayNos(arr,i,j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int a = 10;
        int b = 5;

        Lecture18 lc18 = new Lecture18();
//        lc18.swapTwoNumbers(a,b);


//        int[] ans = lc18.reverseOfArray(arr);
//        printArray(ans);

//        System.out.println();
//        System.out.println();

//        int[] reversedArray = new int[arr.length];
////        for(int i = arr.length - 1; i >= 0 ; i--){
////            reversedArray[4-i]= arr[i];
////        }
//        int i = arr.length-1;
//        while (i>=0){
//            reversedArray[4-i] = arr[i--];
//        }
//        printArray(reversedArray);


//        lc18.reverseOfArray(arr);
//        printArray(arr);

        lc18.ArrayReverse(arr);
        printArray(arr);
    }
}
