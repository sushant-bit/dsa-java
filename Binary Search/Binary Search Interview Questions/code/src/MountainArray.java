//852. Peak Index in a Mountain Array
public class MountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,10,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int peakIndexInMountainArray(int[] arr) {
            int start=0;
            int end = arr.length-1;
            while (start<end){
                int mid = start+(end-start)/2;
                if (arr[mid]>arr[mid+1]){
                    //now youre in decreasing part of array this may be answer but look at left
                    //this is why end is not = mid-1
                    end=mid;
                }
                else {
                    //youre in ascending part of an array
                    start=mid+1;
                }
            }
            return start;
    }
}
