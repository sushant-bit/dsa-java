import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int[] arr={1,24,6,0,4,9,0,4,3,0,5,3,0};
        int[]arr2={2,4,6,8,-2,-7};
        moveAllZeroLast(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(checkSorted(arr2));
        System.out.println(average(arr2));
        System.out.println(Arrays.toString(negativenum(arr2)));
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

    static int average(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    static int[] negativenum(int[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                count++;
            }
        }

        int[] negarr=new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negarr[index] = arr[i];
                index++;
            }
        }

        return negarr;
    }
}
