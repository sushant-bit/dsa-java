import java.util.Arrays;

//283. Move Zeroes
public class Problem_283 {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,23,0,12,0,2};
        moveZero(arr);
    }

    static void moveZero(int[] arr){
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

        System.out.println(Arrays.toString(arr));
    }
}
