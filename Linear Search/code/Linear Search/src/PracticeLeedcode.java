public class PracticeLeedcode {
    public static void main(String[] args) {
        int[] nums={23,432412,3243,323,34,42,30,54};
        int result=evennumber(nums);
        System.out.println(result);
    }

    static int evennumber(int[] nums){
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                count++;
            }
        }
        return count;
    }

}
