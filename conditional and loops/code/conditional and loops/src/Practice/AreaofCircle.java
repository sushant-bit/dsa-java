package Practice;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = sc.nextInt();
        double pi = 3.141592653589793;
        double area = pi*(radius*radius);
        System.out.print("Area of the circle is: "+area);
    }
}
