//852. Peak Index in a Mountain Array
public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int peakIndexInMountainArray(int[] arr) {
         int start = 0;
         int end = arr.length-1;
         while(start<=end){
             int mid = start+(end-start)/2;
             if (arr[mid]>arr[mid+1]){
                 end=mid;
             }
             else if (arr[mid]<arr[mid+1]){
                 start=mid+1;
             }
             else {
                 return mid;
             }
         } return -1;
    }
}
