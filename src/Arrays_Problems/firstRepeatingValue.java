package Arrays_Problems;

public class firstRepeatingValue {
    static int firstRepeatingValueMethod(int arr[]){
        int ans = -1;
        for(int  i = 0 ; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,4,6,3,5,4,5};

        int result = firstRepeatingValueMethod(a);
        System.out.println(result);
    }
}
