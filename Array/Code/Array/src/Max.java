import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much value you want to add in the array: ");
        int value= sc.nextInt();
        int[] arr = new int[value];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(maxval(arr));
    }
//imagine that arrray is not empty
    static int maxval(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
