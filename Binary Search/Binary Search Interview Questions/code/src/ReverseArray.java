import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
    int[] arr={1,2,3,4};
    int[] result=reverseArray(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] reverseArray(int [] arr){
        int start=0; //this is the first index of array
        int end = arr.length-1; //this is the last index of array
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
