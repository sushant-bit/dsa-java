public class SplitsLargestSum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start=0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]); //this will contain the max item from the array
            end+=nums[i];
        }
        while (start<end){
            //try for the middle as potential answer
            int mi=start+(end-start)/2;

        }
        return end;
    }

    
}
