import java.util.Arrays;
import java.util.Scanner;

public class MultiDimesion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */


//        int[][] matrixarr= new int[3][];
//         int[][] matrixar={
//                 {1,2,3},
//                 {3,2,1},
//                 {1,2,3}
//         };
//            int [][] arr2D = {
//                    {1,2,3},//0th index
//                    {4,5},//1st index
//                    {6,7,8,9}//2nd index -> arr@2D[2] = {6,7,8,9}
//            };
//        System.out.println(Arrays.toString(arr[0]));

        // creating new 2d array

        int [][] array= new int[3][3];
        // this is for user input process
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col]=in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.print(array[row][col]+" ");
//            }
//            System.out.println();
//        }

        //output
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
        }





    }
}
