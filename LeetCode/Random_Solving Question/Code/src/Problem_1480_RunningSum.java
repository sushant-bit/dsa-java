import java.util.Arrays;

public class Problem_1480_RunningSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int [] res= runsum(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] runsum(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}
