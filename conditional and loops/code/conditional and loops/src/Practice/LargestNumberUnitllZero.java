package Practice;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.

public class LargestNumberUnitllZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int largest=0;
        while(true){
            System.out.println("Enter a number to find largest: ");
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
            largest=num;}
        }

        System.out.println(largest);
    }
}
