import java.util.Arrays;

//problem number 1_leetcode Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class Problem_1 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,0,6}; //this problem only give the first pair which sum is equal to target
        int[] res=twoSum(arr,6);
        System.out.println(Arrays.toString(res));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
