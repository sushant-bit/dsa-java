public class BinarySearch_278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }



    static boolean isBadVersion(int version) {
            int bad = 4;
            return version >= bad;
        }


    static int firstBadVersion(int n) {
        int start=1;
        int end = n;

        while(start<end){
            int mid = start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }


}
