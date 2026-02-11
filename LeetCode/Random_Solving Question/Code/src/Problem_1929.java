import java.util.Arrays;

//1929. Concatenation of Array
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
public class Problem_1929 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] ans= concatenation(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] concatenation(int[] arr){
        int n=arr.length; //taking the length of array
        int[] ans= new int[n*2]; //doubling the size of array in new array by multiplying by 2 with the length of array(n)
        for (int i = 0; i < n; i++) {
            ans[i]=arr[i]; //replacing the value of array into new array.
            ans[n+i]=arr[i];
        }
        return ans;
    }
}