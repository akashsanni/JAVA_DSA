package Arrays;
class ArrayExample{
    void maxArray(){
        int[] arr = {24,23,45,6,71,21};
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
    void minArray(){
        int[] arr = {24,23,45,6,1,71,21,0};
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
    void returnIndexOfSearchItem(){
        //Linear Search
        int[] arr = {1,5,3,56,23,6,7,5};
        int searchElement = 5;
        int ans =-1;
        for(int i =0 ;i<arr.length;i++){
//            ans = (searchElement == arr[i]) ? i : ans ;
            if(searchElement == arr[i]){
                ans = i;
                break; // logic for the first occurance
            }
        }
        System.out.println(ans);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample();
        arr.maxArray();
        arr.minArray();
        arr.returnIndexOfSearchItem();
    }
}
