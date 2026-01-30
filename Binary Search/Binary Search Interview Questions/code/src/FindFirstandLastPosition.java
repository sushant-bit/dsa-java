//leetcode problem number 34
public class FindFirstandLastPosition {
    public static void main(String[] args) {
        int [] arr = {1,4,5,5,5,6,7,8,8,10};
        int[] ans=searchRange(arr,5);
        System.out.println(ans);
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);


        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    //this function just return the index value of target
    static int search(int[] nums, int target, boolean findstartindex){
        int ans=-1;
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
                //potential ans find
                ans=mid;
                if (findstartindex ){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;

    }
}
