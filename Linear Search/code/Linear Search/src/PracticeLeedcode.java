// Leetcode problem 1295

public class PracticeLeedcode {
    public static void main(String[] args) {
        int[] arr={12,232,54,45,65,543,565543};
        int result = Findnumber(arr);
        System.out.println(result);
    }

    static int Findnumber(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int digits=0;
            while(nums[i]>0){
                digits++;
                nums[i] /=10;
            }

            if (digits%2==0){
                count++;
            }
        } return count;
    }

}
