//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int [] arr = {1,2,23,453,53,464,4553,434,68,99};
    int target=99;
    int ans = linearSearch(arr,target);
        System.out.println(ans);
    //find whether 14 exist in array or not

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==14){
//                System.out.println("Yes this array Contain 14");
//            }
//            else {
//                System.out.println("Opps not 14 in the array");
//                break;
//            }
//        }

    }
    //search in the array: return the index if item found otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        //run a for loop

        for (int index = 0; index < arr.length; index++) {
            //check for every element if it is = target
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        //this line will execute if the none of the return statement have executed
        //hence the target not found
        
    }
}