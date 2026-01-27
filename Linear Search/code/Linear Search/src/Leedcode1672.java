public class Leedcode1672 {
    public static void main(String[] args) {

        int [][] account={
                {323,23,2323,23},
                {232,323,35,34,54},
                {23,45667,675,6566}
        };
        int result = wealthy(account);
        System.out.println(result);

    }
    static int wealthy(int[][] accounts){
        int ans=0;
        for (int row = 0; row < accounts.length; row++) {
            int sum=0;
            for (int bank = 0; bank < accounts[row].length; bank++) {
                sum+=accounts[row][bank];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans; // this will return the answer
    }
}
