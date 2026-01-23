import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the two index to swap their value: ");
        int in1=sc.nextInt();
        int in2= sc.nextInt();
        swap(arr,in1,in2);
        System.out.println(Arrays.toString(arr));
        
    }

    static void swap(int[] arr,int indexOne,int indextwo){
        int swapping = arr[indexOne];
        arr[indexOne]=arr[indextwo];
        arr[indextwo]=swapping;
    }


}
