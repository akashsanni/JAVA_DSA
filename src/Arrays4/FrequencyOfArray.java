package Arrays4;

import java.util.Scanner;

public class FrequencyOfArray {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0 ; i < arr.length; i++){
            freq[arr[i]]++;// freq[arr[i]] =  freq[arr[i]]+1 ;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i = 0 ; i < size;i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);
        System.out.println("Enter no of queries");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter query to search: ");
            int x = sc.nextInt();
            if(freq[x] > 0 ){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
