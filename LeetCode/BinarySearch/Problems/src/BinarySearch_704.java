// LeetCode 704 - Binary Search
// Time: O(log n)
// Space: O(1)
public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] arr={1,2,34,344,444,555};
        int target=555;
        int result=search(arr,target);
        System.out.println(result);
    }

    static int search(int[] nums, int target) {
        int start=0;
        int end =nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}