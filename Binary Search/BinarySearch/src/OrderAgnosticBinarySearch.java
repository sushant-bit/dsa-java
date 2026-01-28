public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,67,705,5440};
        int[] arr2={100,90,40,23,12,5,4,3,-12,-16};
        System.out.println(orderAgnosticBinarySearch(arr2,3));

    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end] ;
        //same thing
//        if (arr[start]<arr[end]){
//            isAsc=true;
//        }
//        else {
//            isAsc=false;
//        }

        while (start <= end) {
            //find the middle element
//            int mid=(start+end)/2;// if start and end have exceed value than the integer then it will give an erro.
            int mid = start + (end - start) / 2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;

                } else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
