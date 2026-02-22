//53. Maximum Subarray
public class Problem_53_Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr={10,5,-25,15,18};
        System.out.println(maxSubarray(arr));
    }

    static int maxSubarray(int[]arr){
        int newSum=arr[0];
        int maxSum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (newSum<0){
                newSum=arr[i];
            }
            else{
                newSum+=arr[i];
            }

            if(newSum>maxSum){
                maxSum=newSum;
            }
        }
        return maxSum;
    }
}
