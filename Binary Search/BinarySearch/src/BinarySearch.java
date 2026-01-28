public class BinarySearch {
    public static void main(String[] args) {

        int[] arr ={2,3,4,15,16,19,20,45,55,60,70,80,90,95,105};
        int result=binarySearch(arr,90);
        System.out.println(result);
    }


    //return the index
    //return -1 if target doesnot exist
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
//            int mid=(start+end)/2;// if start and end have exceed value than the integer then it will give an erro.
            int mid =start + (end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                //ans found
                return mid;
            }
        } return -1;
    }
}