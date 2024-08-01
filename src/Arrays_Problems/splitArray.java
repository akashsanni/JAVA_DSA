package Arrays_Problems;
import java.io.*;
import java.util.*;

/*

Given an array arr[] of 1s and -1s, the task is to partition the array into maximum subarrays
such that the sum of the alternating sum of all the subarrays is 0. Print the ranges of the subarrays and the number of subarrays.

Note: The alternating sum of a subarray a[] is defined as a[0] – a[1] + a[2] – a[3] . . .

Approach: This problem can be solved using the following idea.

Since the only elements present in the array are 1 and -1 for any two consecutive elements there are 4
 possibilities in total  like {1, 1}, {1, -1}, {-1, 1}, {-1, -1} the alternating sum in the 4 cases is :

{1, 1} -> 1 – 1 = 0;
{1, -1}-> 1 + 1 = 2;  —> In this case it can be considered as {1}, {-1} => 0
{-1, 1}-> -1 – 1 = -2; —> In this case it can be considered as {-1}, {1} => 0
{-1, -1}-> -1 + 1 = 0;

In the first and fourth case the alternating sum is 0 so in that case they can be considered as one
 subarray and in remaining two cases individual element is considered as a subarray.
Input: {-1, 1, 1, 1, 1, 1}
Output:
{0, 0}, {1, 1}, {2, 3}, {4, 5}
4
Explanation: From index 0 to 0 the alternating sum is -1. From 1 to 1 the alternating sum is 1. From
index 2 to 3 and index 4 to 5 the sum is 1 – 1 = 0. The sum of the alternating sums is -1 + 1 + 0 + 0 = 0.
 So these are two partitions whose sum of alternating sums is 0.

Input: {1, 1, 1, 1}
Output:
{0, 1}, {2, 3}
2

 */

public class splitArray{

    // Function to print and count the subarrays ranges
    static ArrayList<ArrayList<Integer> > countSubarrays(int arr[], int n)
    {
        ArrayList<ArrayList<Integer> > p
                = new ArrayList<ArrayList<Integer> >();
        // If the size is odd print -1
        if ((n & 1)!=0) {
            System.out.println(-1);
            return p;
        }

        // Initialize the count to 0
        int cnt = 0;

        for (int i = 0; i < n; i += 2) {

            // If consecutive elements are
            // of the same sign
            if ((arr[i] > 0 && arr[i + 1] > 0)
                    || (arr[i] < 0 && arr[i + 1] < 0)) {

                p.add( new ArrayList<Integer>(Arrays.asList(i, i+1)));
                cnt++;
            }
            else {
                p.add( new ArrayList<Integer>(Arrays.asList(i, i)));
                p.add( new ArrayList<Integer>(Arrays.asList(i+1, i+1)));
                cnt += 2;
            }
        }

        return p;
    }

    // Driver function
    public static void main (String[] args) {
        int arr[] = { -1, 1, 1, 1, 1, 1 };
        int N = arr.length;

        // Function call
        ArrayList<ArrayList<Integer> > ans= countSubarrays(arr, N);

        if (ans.size() == 0)
            System.out.println("-1");
        else {
            for (ArrayList<Integer> u : ans) {
                System.out.println(u.get(0)+" "+u.get(1));
            }
            System.out.print(ans.size());
        }
    }
}

//Time Complexity: O(N) where N is the size of the array
//Space Complexity: O(1)

//git changes check

