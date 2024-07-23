package Arrays;

import java.util.Arrays;

public class UnionOfArrays {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        int b[]= {9,1,2,3,4,5,6};
        /*
        Array must be sorted!
         */
        Arrays.sort(a);
        Arrays.sort(b);
        int m = a.length;
        int n = b.length;
        int x = 0 , y = 0;

        //Logic
        while(x<m && y<n){
            if(a[x] < b[y]){
                System.out.print(a[x]+" ");
                x++;
            } else if (b[y] < a[x]) {
                System.out.print(b[y]+" ");
                y++;
            }else {
                System.out.print(b[y]+" ");
                x++;
                y++;
            }
        }
        while(x<m){
            System.out.print(a[x]+" ");
            x++;
        }
        while(y<n){
            System.out.print(b[y]+" ");
            y++;
        }

    }
}
