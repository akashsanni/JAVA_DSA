package Arrays_Problems;
/*
Find the total number of pairs in the Array
whose sum is equal to the given value x.
input: 4,6,3,5,8,2
target = 7 , {4,3}, {5,2}
output:
ans = 2
 */
public class TargetSum {

    int targetSumTwoElement(int[] a,int target){
        int ans = 0;
        for(int i =0 ;i<a.length; i++){
            for(int j =i+1 ;j<a.length;j++){
                if(a[i]+a[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    int targetSumThreeElement(int[] a,int target){
        int ans = 0;
        for(int i =0 ;i<a.length; i++){
            for(int j =i+1 ;j<a.length;j++){
                for(int k=j+1;k< a.length;k++){
                    if(a[i]+a[j]+a[k] == target) ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]= {4,6,3,5,8,2};
        int target1 = 7;
        int b[] = {1,4,5,6,3,3};
        int target2 = 12;
        TargetSum obj1 = new TargetSum();
        int result1 = obj1.targetSumTwoElement(a,target1);
        System.out.println(result1);
        int result2 = obj1.targetSumThreeElement(b,target2);
        System.out.println(result2);
    }
}
