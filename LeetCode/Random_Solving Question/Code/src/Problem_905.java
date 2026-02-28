public class Problem_905 {
    public static void main(String[] args) {
    
    }

    static void sortArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
