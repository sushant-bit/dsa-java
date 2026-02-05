//367. Valid Perfect Square
public class Problem_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(64));
        
    }
    static boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int start=1;
        int end = num;
        while (start<end){
            int mid = start+(end-start)/2;
            int square=mid*mid;
            if (square==num){
                return true;
            }else if (square<num){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return false;
    }
}
