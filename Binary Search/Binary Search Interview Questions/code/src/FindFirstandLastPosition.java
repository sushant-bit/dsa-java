//leetcode problem number 34
public class FindFirstandLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end=nums.length;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]){
                start=mid+1;
            }
            else{
                //
                if (target<)
            }
        }
        return nums[-1,-1];
    }
}
