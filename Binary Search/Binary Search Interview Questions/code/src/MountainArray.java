//852. Peak Index in a Mountain Array
public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int peakIndexInMountainArray(int[] arr) {
         int start = 0;
         int end = arr.length-1;
         while(start<end){
             int mid = start+(end-start)/2;
             if (arr[mid]>arr[mid+1]){
                 //you are in the descending part of an array
                 //this may be the answer, but look at left
                 //this is why end != mid - 1
                 end=mid;
             }

             else {
                 //you are in the ascending part of the array
                 start=mid+1; //because we know that mid+1 element is greater than  mid element
             }
         } //in the end, start==end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to finding max element in the above 2 check
        //hence when they are pointing to just one element, that is the max because that is what the check say
        return start;//or end as both are equal
    }
}
