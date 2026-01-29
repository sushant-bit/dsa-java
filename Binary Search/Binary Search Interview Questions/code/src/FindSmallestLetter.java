//Find Smallest Letter Greater Than Target Leetcode-Problem N0 - 744
//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
public class FindSmallestLetter {
    public static void main(String[] args) {
        char [] arr ={'c','f','j'};
        System.out.println(smallestletter(arr,'k'));
    }
    static  char smallestletter(char[] letters, char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (letters[mid]<=target){
                start=mid+1;
            } else{
                end=mid-1;
            }

        }
        return letters[start%letters.length];
    }
}
