import java.util.Arrays;

//26. Remove Duplicates from Sorted Array
public class Problem_26 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,6,7,7};
        System.out.println(removeDuplicates(arr));
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] nums) {
        int ind=0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]!=nums[ind]){
                ind++;
                nums[ind]=nums[i];
            }
        }

        return ind+1; //this will return how many unique element does array have.
    }
}
