import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,23,2432,34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[1]=21; // if you make a change to the object via this reference variable same object will be change
    }
}
