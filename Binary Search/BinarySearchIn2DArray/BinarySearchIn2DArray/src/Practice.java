import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40,50},
                {15,25,35,45,55},
                {17,27,36,46,56},
                {20,28,38,48,59}
        };
        System.out.println(Arrays.toString(search2D(arr,38)));
    }
    static int[] search2D(int[][] arr, int target){
        int row=0;
        int col=arr.length-1;
        while (row<arr.length&&col>=0){
            if (arr[row][col]==target){
                return new int[]{row,col};
            } else if (arr[row][col]>target) {
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
