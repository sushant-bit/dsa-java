//solving leecode problem number 1051
public class Problem_1051 {
    public static void main(String[] args) {

    }
    public int heightChecker(int[] heights) {

        int n = heights.length;

        int[] exp = new int[n];
        for(int i = 0; i < n; i++){
            exp[i] = heights[i];
        }


        for(int i = 0; i < n; i++){
            int minind = i;

            for(int j = i + 1; j < n; j++){
                if(exp[j] < exp[minind]){
                    minind = j;
                }
            }

            int temp = exp[i];
            exp[i] = exp[minind];
            exp[minind] = temp;
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            if(heights[i] != exp[i]){
                count++;
            }
        }

        return count;
    }
}
