public class RotateSortedArray {
    public static void main(String[] args) {

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
            if (arr[mid]<arr[mid-1]){
                return mid-1;
            }


        }
    }

}
