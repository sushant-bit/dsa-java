//875. Koko Eating Bananas
public class Problem_875 {
    public static void main(String[] args) {
     int[] arr={3,4,523,22,32};
        System.out.println(minEatingSpeed(arr,5));
    }

    static int minEatingSpeed(int[] piles, int h) {

        int right = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }

        int left = 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
