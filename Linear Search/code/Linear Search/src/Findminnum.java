public class Findminnum {
    public static void main(String[] args) {
        int[] arr ={23,2434,23,-1,23,33242,2,42423,342,3232,1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int mini=arr[0];
        if (arr.length==0){
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
           if (arr[i]<mini){
               mini=arr[i];
               return mini;
           }

        }
        return -1;
    }
}
