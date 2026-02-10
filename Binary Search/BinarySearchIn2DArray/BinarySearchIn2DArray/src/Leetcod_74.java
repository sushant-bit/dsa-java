//74. Search a 2D Matrix
public class Leetcod_74 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        int start=0;
        int end=(row*col)-1;

        while(start<=end){
            int mid=start+(end-start)/2; //using the concept of binarysearch
            int mrow=mid/col;
            int mcol=mid%col;

            int midvalue= matrix[mrow][mcol];

            if(midvalue==target){
                return true;
            }else if(target>midvalue){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;

    }
}
