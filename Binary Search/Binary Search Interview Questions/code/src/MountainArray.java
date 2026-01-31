//852. Peak Index in a Mountain Array
public class MountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
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
                }
            }
    }
}
