public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={12,23,32,34,-3,34,-343,34,455,3};
        int target=-3;
        int result=linearSearch(arr,target,1,4);
        System.out.println(result);
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1; // target not found
    }


}
