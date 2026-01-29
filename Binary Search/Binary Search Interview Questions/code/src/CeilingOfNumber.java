
public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr ={2,3,5,9,14,16,18};
        System.out.println(ceilingofnum(arr,159));
    }
    static  int ceilingofnum(int[] arr, int target){
       // if the target is greater than the end of the element of the array.
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return start; // when the condition is violated so it will return the start. which is the closest greatest number of the target
    }
}