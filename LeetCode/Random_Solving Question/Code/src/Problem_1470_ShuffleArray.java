import java.util.Arrays;

public class Problem_1470_ShuffleArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans= new int[n*2];
        int index=0;
        for (int i = 0; i < n; i++) {
            ans[index++]=nums[i];
            ans[index++]=nums[i+n];
        }
        return ans;
    }
}
