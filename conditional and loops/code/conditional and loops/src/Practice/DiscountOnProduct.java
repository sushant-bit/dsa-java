package Practice;

import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String PrductName=sc.next();
        System.out.print("Enter a Price of Product: ");
        int priceofProdcut = sc.nextInt();
        System.out.print("Enter Discount in Percentage: ");
        float dis = sc.nextFloat();
        float total=priceofProdcut-(priceofProdcut*dis)/100;
        System.out.println("Price of "+PrductName +" After "+dis+"% Discount is = "+total);
    }
}
