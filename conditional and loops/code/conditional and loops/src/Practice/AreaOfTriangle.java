package Practice;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Base: ");
        float b=sc.nextFloat();
        System.out.print("Enter a Height: ");
        float h=sc.nextFloat();
        float area = (b*h)/2;
        System.out.println("Area of the Triangle is: "+area);

    }
}
