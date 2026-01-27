import java.util.Scanner;

public class MakingrandomProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row how many you want in 2D array: ");
        int rows= sc.nextInt();
        System.out.print("Enter a column how many you want in 2D array: ");
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];
    }
}
