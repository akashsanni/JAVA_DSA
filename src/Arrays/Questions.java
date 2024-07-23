package Arrays;

public class Questions {
    boolean isSorted(int[] arr){
        boolean isSortedVar = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSortedVar = false;
                break;
            }
        }
        return isSortedVar;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,4,6};
        Questions q = new Questions();
        System.out.println(q.isSorted(arr1));
    }
}
