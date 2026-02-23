public class Problem_268 {
    public static void main(String[] args) {
        int[] arr={1,2,0,4};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int n=nums.length;
        int total_sum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        return total_sum-sum;
    }
}
