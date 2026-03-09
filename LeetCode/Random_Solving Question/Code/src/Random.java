import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int[] arr={1,24,6,0,4,9,0,4,3,0,5,3,0};
        int[]arr2={1,2,3,4,5};
        moveAllZeroLast(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(checkSorted(arr2));
    }

    static void moveAllZeroLast(int[]arr){
        int ind=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[ind]=arr[i];
                ind++;
            }
        }

        while (ind< arr.length){
            arr[ind]=0;
            ind++;
        }
    }

    static boolean checkSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
