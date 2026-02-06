public class SplitsLargestSum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start=0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]); //this will contain the max item from the array
        }
    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
