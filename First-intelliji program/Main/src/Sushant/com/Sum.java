package Sushant.com;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int s = su.nextInt();
        System.out.print("Enter a second Number: ");
        int u = su.nextInt();
        int sum = s+u;
        System.out.println("The sum of "+s+" and "+u+" is = "+ sum);
    }
}
