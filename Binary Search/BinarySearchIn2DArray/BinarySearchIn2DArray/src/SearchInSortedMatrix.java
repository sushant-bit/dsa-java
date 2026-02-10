public class SearchInSortedMatrix {
    public static void main(String[] args) {

    }

 static int[] SearchIn2DSortedMatrix(int[][] arr, int target){
        int row=arr.length;
        int col=arr[0].length;

        int start=0;
        int end=(row*col)-1;  // total elements in the 2D matrix -1 to find the last index.

     while(start<=end){
         int mid=start+(end-start)/2;
         int mrow=mid/col;
         int mcol=mid%col;

         if (arr[mrow][mcol]>target){
             end=mid-1;
         } else if (target>arr[mrow][mcol]) {
             start=mid+1;
         }
         else{
             return new int[]{mrow,mcol};
         }
     }
     return new int[]{-1,-1};
 }

}
