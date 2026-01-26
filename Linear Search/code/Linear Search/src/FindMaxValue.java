public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {213,24,-34,23,23,232,4};
        int result= maxValue(arr);
        System.out.println(result);
    }

    static int maxValue(int[] arr){

        int max=arr[0];
        if (arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
