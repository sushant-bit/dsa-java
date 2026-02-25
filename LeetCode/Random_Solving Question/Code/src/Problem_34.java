public class Problem_34{
    public static void main(String[] args) {

    }

    static int firstTarget(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int ans=-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                ans=mid;
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
    }
}
