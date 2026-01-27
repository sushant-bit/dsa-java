import java.util.Arrays;
import java.util.Scanner;

public class MakingrandomProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row how many you want in 2D array: ");
        int rows= sc.nextInt();
        System.out.print("Enter a column how many you want in 2D array: ");
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];

        //asking user input
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < column; col++) {
                arr[row][col]= sc.nextInt();
            }
        }

    }


    static int maxWealth(int[][] accounts){
        int maxwealth=0;
        for (int money = 0; money < accounts.length ; money++) {
            int sum =0;
            for (int bank = 0; bank < accounts[money].length; bank++) {
                sum+= accounts[money][bank];
            }

            if (sum>maxwealth){
                maxwealth=sum;
            }
        }
        return maxwealth;
    }
}
