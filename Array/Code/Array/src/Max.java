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
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
//imagine that arrray is not empty
//    static int maxval(int[] arr){
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//
//            if (max<arr[i]){
//                max=arr[i];
//            }
//        }
//        return max;
//    }


    //max value in the range
//    static int maxvalinRange(int[] arr,int start, int end){
//        int max = arr[start];
//        for (int i = start; i <= end; i++) {
//
//            if (max<arr[i]){
//                max=arr[i];
//            }
//        }
//        return max;
//    }


    //reversing the array
    static void reverse(int[] arr){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                //swap
                swap(arr, start,end);
                start++;
                end--;
            }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
