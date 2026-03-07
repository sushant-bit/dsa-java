public class Problem_1984 {
    public static void main(String[] args) {

    }
    public int minimumDifference(int[] nums, int k) {

        int n = nums.length;

        if (k == 1) {
            return 0;
        }

        for (int i = 0; i < n - 1; i++) {
            boolean adlabadli = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    adlabadli = true;
                }
            }

            if (!adlabadli) {
                break;
            }
        }

        int minDiff = nums[k - 1] - nums[0];

        for (int i = 1; i <= n - k; i++) {
            int diff = nums[i + k - 1] - nums[i];

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
