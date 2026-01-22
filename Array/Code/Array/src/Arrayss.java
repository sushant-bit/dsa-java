import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int rows = sc.nextInt();
        System.out.print("Enter a column: ");
        int column = sc.nextInt();
        int[][] matrix = new int[rows][column];
        System.out.println(matrix.length);

        //this process is for taking input from the user

        // this first loop is used to loop in row section
        for (int row = 0; row < matrix.length; row++) {
            //this is loop is for column section
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]=sc.nextInt();
            }
        }

        //this process is for printing the output

        for (int[] ints : matrix) {
            //this is loop is for column section
            System.out.println(Arrays.toString(ints));
        }

    }
}
