package ArrayMethods;
//Array.fill()  method...
// Java program to fill a subarray of given array
import java.util.Arrays;

public class FillMethod {

    // Java program to fill a sub-array array with
    // given value.
    static void FillArrayWithGivenValue() {
        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};

        // Fill from index 1 to index 4.
        Arrays.fill(ar, 1, 5, 10);

        System.out.println(Arrays.toString(ar));
    }


    public static void main(String[] args) {

        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        // To fill complete array with a particular
        // value
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar));

//        Output:-
//        Array completely filled with 10
//        [10, 10, 10, 10, 10, 10, 10, 10, 10]


        FillArrayWithGivenValue();
//        Output:-
//        [2, 10, 10, 10, 10, 2, 2, 2, 2]
    }
}



