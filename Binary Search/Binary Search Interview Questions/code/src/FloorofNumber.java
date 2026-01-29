public class FloorofNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        System.out.println(floorOfnum(arr,200));

    }

    static int floorOfnum(int[] arr, int target){
        if (target>arr[arr.length-1]){ //if the target is greater than the end of the element of the array.
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return end; // when the condition is violated so it will return the end. which is the closest smallest number of the target
    }
}
