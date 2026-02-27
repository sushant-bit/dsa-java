//238. Product of Array Except Self
public class Problem_238 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=answer[i-1]*nums[i-1];
        }
    }
}
