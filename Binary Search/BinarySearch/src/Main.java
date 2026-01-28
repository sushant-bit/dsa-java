//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][] arr ={
                {123,3234,3343,23,2,32,5},
                {423,4534,545,5,4,4,433,434},
                {54,8,75,6,5}
        };
        int target = 5;
        System.out.println(findArray(arr,target));

    }


    static int findArray(int[][] arr, int target){
        int count=0;
        int index;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target==arr[row][col]){
                    count++;
                }
            }

        }
        return count;
    }
}