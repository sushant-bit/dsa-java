import java.util.Arrays;

public class RoughPractice {
    public static void main(String[] args) {
     int[] arr = {2,4,8,8,9,10,11,12,13};
     int target=8;
     int[] result=firstandlast(arr,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] firstandlast(int[] arr, int target){
        int[] ans={-1,-1};
        int firstindex=indexfinder(arr,target,true);
        int lastindex=indexfinder(arr,target,false);
        ans[0]=firstindex;
        ans[1]=lastindex;
        return ans;
    }

    static int indexfinder(int[] arr, int target,boolean findfirstindex){
        int ans = -1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                ans=mid;
                if(findfirstindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
