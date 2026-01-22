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
        System.out.print(Arrays.toString(matrix));
    }
}
