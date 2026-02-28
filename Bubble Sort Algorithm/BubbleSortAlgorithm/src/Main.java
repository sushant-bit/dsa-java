import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={12,3,4,63,7,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[]arr){
        //first run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step max item will come last at the respective index
            for (int j = 1; j < arr.length-i; j++) {
            //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap the value
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}