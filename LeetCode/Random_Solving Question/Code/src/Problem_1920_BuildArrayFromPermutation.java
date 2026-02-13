import java.util.Arrays;

public class Problem_1920_BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] ans = {0,2,1,5,3,4,5};

    }

    public int[] buildArray(int[] nums) {
        int n=nums.length; //calculate the length of array
        int[] ans=new int[n]; //creating a new array with the same length.
        for (int i = 0; i < n; i++) {
            ans[i]=nums[nums[i]]; //storing the new value in new array(ans)
        }
        return ans; //return the value of new array.
    }
}
