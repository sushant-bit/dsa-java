package Practice;

import java.util.Scanner;

public class FactoofnthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial: ");
        int num = sc.nextInt();
       int result = 1;
       int count=1;
       //using for loop
//       for(int i=1; i<=num;i++){
//           result=result*i;
//       }

        //using while loop
//        while(count<=num){
//            result=result*count;
//            count++;
//        }

        // using do while loop

        do{
            result=result*count;
            count++;
        }while(count<=num);
        System.out.println(result);
    }
}
