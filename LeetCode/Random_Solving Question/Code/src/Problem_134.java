public class Problem_134 {
    public static void main(String[] args) {
    
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

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
