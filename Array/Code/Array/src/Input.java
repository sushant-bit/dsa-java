import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many data should be array have: ");
        int numdalo= sc.nextInt();

         int[] arr = new int[numdalo];
         arr[0]=23;
         arr[1]=2334;
        System.out.println(arr[1]);

        int[] arkoarr= new int[5];
        for (int i = 0; i < arkoarr.length; i++) {
            arr[i]=sc.nextInt();
            System.out.println(i);
            System.out.println(i+1);
        }


        // input using for loops
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
        }

        System.out.print(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//        for(int num: arr){// for every element in array print the element
//            System.out.println(num);//here num represent the element of an array
//        }

    }
}
