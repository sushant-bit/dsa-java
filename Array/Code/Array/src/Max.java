public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(max(arr));
    }

    static int main(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            if (max>arr[i]){
                max=arr[i];
            }
        }
    }
}
