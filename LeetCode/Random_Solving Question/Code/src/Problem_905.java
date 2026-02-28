import java.util.Arrays;

public class Problem_905 {
    public static void main(String[] args) {
    int[] arr={1,212,32,3,34};
    sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
