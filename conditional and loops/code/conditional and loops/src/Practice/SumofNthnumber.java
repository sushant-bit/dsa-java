package Practice;

import java.util.Scanner;

public class SumofNthnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many number you want to sum: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n; i++){
            System.out.println("Enter a " +i+" number: ");
            int num= sc.nextInt();
            sum=sum+num;
        }

        System.out.println("The sum of all "+n+" number you entered is = "+sum);
    }
}
