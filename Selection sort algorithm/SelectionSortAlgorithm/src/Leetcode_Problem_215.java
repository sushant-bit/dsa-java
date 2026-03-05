public class Leetcode_Problem_215 {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {

        for(int i = 0; i < k; i++) {

            int maxIndex = i;

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        return nums[k-1];
    }
}

