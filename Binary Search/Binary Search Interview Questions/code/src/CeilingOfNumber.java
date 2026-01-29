
public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr ={2,3,5,9,14,16,18};
        System.out.println(ceilingofnum(arr,5));
    }
    static  int ceilingofnum(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
                for (int i = 0; i < arr.length; i++) {

            }
            if (arr[mid]<target){
                end=mid-1;
            } else if (arr[mid]>target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}