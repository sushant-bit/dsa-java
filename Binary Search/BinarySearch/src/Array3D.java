import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][][] arr={
//                {
//                        {12,23,34,44,3},
//                        {234,344,3543,4}
//                },
//                {
//                        {43,44,5,45,4,54,3},
//                        {3,34,34334,34,34,43}
//                },
//                {
//                        {65,655,33455},
//                        {343,8,87,8,5,9,4}
//                }
//        };
//        int target = 34;
//        System.out.println(array3Ds1(arr,target));
        System.out.print("Enter layer: ");
        int layer= sc.nextInt();
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col =sc.nextInt();
        int[][][] arr = new int[layer][row][col];
        array3Ds(arr);
    }

    static void array3Ds(int[][][] arr){
        Scanner sc = new Scanner(System.in);
        //taking input
        for (int layer = 0; layer < arr.length; layer++) {
            for (int row = 0; row < arr[layer].length; row++) {
                for (int col = 0; col < arr[layer][row].length; col++) {
                    arr[layer][row][col]=sc.nextInt();
                }
            }
        }

        //output
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
