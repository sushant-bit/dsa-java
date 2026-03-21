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
        System.out.println(Arrays.toString(findDuplicates(arr)));
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

    static  int[] findDuplicates(int[] arr) {
        int n = arr.length;
        int[] tempur = new int[n]; // store duplicates
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < count; k++) {
                if (tempur[k] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        tempur[count] = arr[i];
                        count++;
                        break;
                    }
                }
            }
        }

        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = tempur[i];
        }

        return res;
    }

     static int firstRepeating(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }


        static void bubblesort(String[] args) {
            int[] arr = {5, 2, 9, 1, 5};

            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

    static int longestSubarraySumK(int[] arr, int K) {
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == K) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }

        return maxLen;
    }

    
    static int countNegatives(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }


}
