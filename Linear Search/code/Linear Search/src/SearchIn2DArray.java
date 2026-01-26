import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {1230,23,231,2123},
                {233,324,56654,2335,55},
                {232,342,432,2,42,4324,324,3423,200000}
        };
        int target=1230;
//        int[] ans=searching(arr,target);
//        System.out.println(Arrays.toString(ans));
        int maxvalue=max(arr);
        System.out.println(maxvalue);

    }
//    static int[] searching(int[][] arr, int target){
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col]==target){
//                    return new int[]{row,col};
//                }
//
//            }
//        }
//        return new int[]{-1,-1};
//    }

    static int max(int[][] arr){
        int maxval=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > maxval) {
                    maxval = ints[col];
                }

            }
        }
        return maxval;
    }
}
