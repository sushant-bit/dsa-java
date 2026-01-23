public class Max {
    public static void main(String[] args) {
        int[] arr = new int[2];
       
        System.out.println(maxval(arr));
    }
//imagine that arrray is not empty
    static int maxval(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
