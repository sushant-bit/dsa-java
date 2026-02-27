//238. Product of Array Except Self
public class Problem_238 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        int n=1;
        for(int i=nums.length-1; i>=0;i--){
            ans[i] = ans[i] * suffix;
            n *= nums[i];
        }
    }
}
