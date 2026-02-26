public class Problem_134 {
    public static void main(String[] args) {
//     int[] arr={1,2,3,43};
//     int[] cost={1,3}; // this input cause error length of cost and array should be equal
        int[] arr = {1,2,3,4};
        int[] cost = {1,3,2,4};
        System.out.println(canCompleteCircuit(arr,cost));
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalKharcha = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalKharcha += cost[i];
        }

        if (totalGas < totalKharcha) {
            return -1;
        }

        //to find starting index.
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return start;
    }
}
