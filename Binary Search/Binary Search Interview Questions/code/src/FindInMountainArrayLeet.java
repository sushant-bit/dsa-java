//leetcode problem no 1095
//1095. Find in Mountain Array
public class FindInMountainArrayLeet {
    public static void main(String[] args) {
 int[] arr={1,2,3,4,5,4,3,10,2,1,-1};
 int target=10;
 int result=search(arr,target);
        System.out.println(result);
    }
    static int search(int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firsttry=binarySearch(arr,target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        else {
            return binarySearch(arr,target,peak+1,arr.length-1);
        }
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

    static int binarySearch(int[] arr, int target,int start,int end) {
        // Step 1: detect sorting order
        boolean isAscending = arr[start] < arr[end];

        // Step 2: normal binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                // ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
     }

}
