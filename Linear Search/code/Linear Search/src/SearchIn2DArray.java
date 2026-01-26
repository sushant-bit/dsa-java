import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {1230,23,231,2123},
                {233,324,56654,2335,55},
                {232,342,432,2,42,4324,324,3423,2}
        };
        int target=42;
        System.out.println(search(arr,target));

    }
    static int search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return target;
                }
            }
        }
        return -1;
    }
}
