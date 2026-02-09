public class SearchInSortedMatrix {
    public static void main(String[] args) {

    }

//    search in the row which is provided
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid= cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (target>matrix[row][mid]) {
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int row=matrix.length;
        int col=matrix[0].length;// be aware, matrix may be empty

        if (row==1){

        }
    }
}
