package Sushant.com;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to get a table: ");
        int t= sc.nextInt();
        int iterate = 1;
        while (iterate<=10){
            System.out.println(t+" X " + iterate + " = "+ (t*iterate) );
            iterate++;
        }
        System.out.println(" ");

        for(int i=1;i<=10;i++){
            System.out.println(t+" X " + i + " = "+ (t*i) );
        }
    }
}

