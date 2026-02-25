public class Problem_34{
    public static void main(String[] args) {


    }

    static int[] searchRange(int[] arr,int target){
        int first=firstTarget(arr, target);
        int second=secondTarget(arr, target);
        return new int[]{first,second};
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
        return -1;
    }

    static int secondTarget(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int ans=-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                ans=mid;
                start=mid+1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }


}
