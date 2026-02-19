//121. Best Time to Buy and Sell Stock

public class Problem_121 {
    public static void main(String[] args) {
    int [] arr={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            } else  {
                int profit=prices[i]-min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        return max;
    }
}
