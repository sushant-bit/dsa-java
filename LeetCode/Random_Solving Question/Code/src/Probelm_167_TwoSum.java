import java.util.Arrays;

//167. Two Sum II - Input Array Is Sorted
public class Probelm_167_TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,7};
        int [] res=twoSum(arr,46);
        System.out.println(Arrays.toString(res));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end = numbers.length-1;

        while (start<end){
            int sum=numbers[start]+numbers[end];
            if (sum==target){
                return new int[] {start+1,end+1};
            } else if (sum<target) {
                start++;
            }
            else {
                end--;
            }
        }

        return new int[]{};
    }
}
