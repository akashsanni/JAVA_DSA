package Arrays4;

public class RearrangeArray {

    /*
    Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
    every positive number is followed by a negative and vice-versa maintaining the order of appearance.
    The number of positive and negative numbers need not be equal. Begin with a negative number.
    If there are more positive numbers, they appear at the end of the array. If there are more negative
    numbers, they too appear at the end of the array.

{1,2,3,-4,-7,-8,-9,-5}
-4 1 -7 2 -8 3 -9 -5

    Input 1:
    N = 6
    arr[] = {1, 2, 3, -4, -1, 4}
//          -4  1 -1   2   3  4
    Output 1:
    arr[] = {-4, 1, -1, 2, 3, 4}

    Input 2:
    N = 4
    arr[] = {1, 2, 3, -4}
    Output 2:
    arr[] = {-4, 1, 2, 3}
     */

    /*
    Let the array be arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 }

    First iteration:

    { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 } , -2 appears on odd index position and is out of place.
    We will look for the first element that appears with an opposite sign
    { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 } => perform rotation of subarray between this two elements
    { -5, 5, -2, 2, 4, 7, 1, 8, 0, -8 }
    Second iteration:

    { -5, 5, -2, 2, 4, 7, 1, 8, 0, -8 } , 4 is out of place.
    { -5, 5, -2, 2, 4, 7, 1, 8, 0, -8 } => -8 is of different sign
    { -5, 5, -2, 2, -8, 4, 7, 1, 8, 0 } => after performing right rotation between 4 to -8
    resultant array arr[] = { -5, 5, -2, 2, -8, 4, 7, 1, 8, 0 }
     */

    /*
    Follow the steps to solve the problem:

    1.Maintain a variable to mark if the element is in its correct position or not. Let the variable be outofplace. Initially, it is -1.
    2.We will iterate over the array.
    3.If outofplace is -1, we will check if the current index is out of place.
        -If the current index is out of place we will update the outofplace with the index value.
        -Else we will keep the value as it is.
    4.If the outofplace is not -1, we will search for the next index which has a different sign than that of the value that is present in outofplace position.
        -Now we will pass this two positions to right rotate our array.
        -Update the value of outofplace by 2 unit (because previously valid elements will now become the out-of-place elements).
     */
    void rightrotate(int arr[], int n, int outofplace, int current)
    {
        int temp = arr[current];
        for (int i = current; i > outofplace; i--)
            arr[i] = arr[i - 1];
        arr[outofplace] = temp;
    }

    void rearrange(int arr[], int n)
    {
        int outofplace = -1;

        for (int index = 0; index < n; index++) {
            if (outofplace >= 0) {
                // find the item which must be moved into the out-of-place entry if out-of-place entry is positive and current entry is
                // negative OR if out-of-place entry is negative and current entry is negative then right rotate
                // [...-3, -4, -5, 6...] -->   [...6, -3,
                // -4, -5...]
                //      ^                          ^
                //      |                          |
                //     outofplace      -->      outofplace

                if (((arr[index] >= 0)
                        && (arr[outofplace] < 0))
                        || ((arr[index] < 0)
                        && (arr[outofplace] >= 0))) {
                    rightrotate(arr, n, outofplace, index);

                    // the new out-of-place entry is now 2
                    // steps ahead
                    if (index - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }

            // if no entry has been flagged out-of-place
            if (outofplace == -1) {
                // check if current entry is out-of-place
                if (((arr[index] >= 0)
                        && ((index & 0x01) == 0))
                        || ((arr[index] < 0)
                        && (index & 0x01) == 1))
                    outofplace = index;
            }
        }
    }
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args)
    {
        RearrangeArray rearrange = new RearrangeArray();
        /* int arr[n] = {-5, 3, 4, 5, -6,
                         -2, 8, 9, -1, -4};
        int arr[] = {-5, -3, -4, -5, -6,
                     2 , 8, 9, 1 , 4};
        int arr[] = {5, 3, 4, 2, 1,
                     -2 , -8, -9, -1 , -4};
        int arr[] = {-5, 3, -4, -7,
                     -1, -2 , -8, -9, 1 , -4};*/
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
//        int arr[] = {1,2,3,-4,-7,-8,-9,-5};
        int n = arr.length;

        System.out.println("Given array is ");
        rearrange.printArray(arr, n);

        rearrange.rearrange(arr, n);

        System.out.println("RearrangeD array is ");
        rearrange.printArray(arr, n);
    }
}
