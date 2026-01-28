import java.lang.reflect.Array;
import java.util.Arrays;

public class Array3D {
    public static void main(String[] args) {
        int [][][] arr={
                {
                        {12,23,34,44,3},
                        {234,344,3543,4}
                },
                {
                        {43,44,5,45,4,54,3},
                        {3,34,34334,34,34,43}
                },
                {
                        {65,655,33455},
                        {343,8,87,8,5,9,4}
                }
        };
        int target = 6;
        System.out.println(array3Ds1(arr,target));

    }

    static void array3Ds(int[][][] arr){
        for (int layer = 0; layer < arr.length; layer++) {
            System.out.println("Layer "+layer);
            for (int row = 0; row < arr[layer].length; row++) {
                System.out.println("Row "+row);
                for (int col = 0; col < arr[layer][row].length; col++) {
                    System.out.print(arr[layer][row][col]+ " ");
                }
                System.out.println();
            }
        }
    }

    static int array3Ds1(int[][][] arr, int target){
        int count=0;
        for (int layer = 0; layer < arr.length; layer++) {
            for (int row = 0; row < arr[layer].length; row++) {
                for (int col = 0; col < arr[layer][row].length; col++) {
                    if (target==arr[layer][row][col]){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
