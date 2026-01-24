import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int [] arr = new int[1000];
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

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

       

        System.out.print(Arrays.toString(arr));
    }
}