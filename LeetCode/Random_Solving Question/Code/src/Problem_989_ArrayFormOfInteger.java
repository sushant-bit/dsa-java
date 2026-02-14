import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Problem_989_ArrayFormOfInteger {
    public static void main(String[] args) {

    }


    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            ans.add(k % 10);
            k /= 10;
        }

        List<Integer> finalResult = new ArrayList<>();
        for (int j = ans.size() - 1; j >= 0; j--) {
            finalResult.add(ans.get(j));
        }

        return finalResult;
    }


}
