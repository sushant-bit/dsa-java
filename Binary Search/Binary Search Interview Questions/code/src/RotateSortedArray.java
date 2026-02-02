public class RotateSortedArray {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int binarySearchPivot(int[] arr,int target){
        int pivot=findPivot(arr);
        //if you didnot find the pivot, it means the array is not rotated
        if (pivot==-1){
            //just do normal binarysearch
            return binarySearch(arr,target,0,arr.length-1);
        }
        else if(arr[pivot]==target){
            return pivot;
        }
        else if(target>=arr[0]){
            
        }
    }
    static int binarySearch(int[] arr, int target, int start,int end){
        while (start<=end){
            int mid= start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            //four cases
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if (arr[mid] <= arr[start]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return -1;
    }

}
