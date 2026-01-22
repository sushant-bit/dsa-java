import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int rows=sc.nextInt();
        System.out.print("Enter a column: ");
        int column= sc.nextInt();
        int[][] newArray = new int[rows][column];

        //step to take input from user

        for (int row = 0; row < newArray.length; row++) {
            for (int col = 0; col < newArray[row].length; col++) {
                newArray[row][col]= sc.nextInt();
            }
        }


        for (int row = 0; row < newArray.length; row++) {
            System.out.println(Arrays.toString(newArray[row]));
        }

    }
}
