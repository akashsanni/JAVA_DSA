package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class No_Of_ELements_After_Union_Arrays {
    static void takingInputArray(int[] a){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of a[] array");
        int m = sc.nextInt();
        System.out.println("Enter size of b[] array");
        int n = sc.nextInt();
        int a[]= new int[m];
        System.out.println("Enter Array a[] Elements");
        takingInputArray(a);
        int b[]= new int[n];
        System.out.println("Enter Array b[] Elements");
        takingInputArray(b);

        /*
        Array must be sorted!
         */
        Arrays.sort(a);
        Arrays.sort(b);
        int x = 0 , y = 0;
        int count = 0;

        //Logic
        while(x<m && y<n){
            if(a[x] < b[y]){
                System.out.print(a[x]+" ");
                count++;
                x++;
            } else if (b[y] < a[x]) {
                System.out.print(b[y]+" ");
                count++;
                y++;
            }else {
                System.out.print(b[y]+" ");
                count++;
                x++;
                y++;
            }
        }
        while(x<m){
            System.out.print(a[x]+" ");
            count++;
            x++;
        }
        while(y<n){
            System.out.print(b[y]+" ");
            count++;
            y++;
        }
        System.out.println();
        System.out.println("No. of Elements present after union of Arrays: "+count);
    }
}
