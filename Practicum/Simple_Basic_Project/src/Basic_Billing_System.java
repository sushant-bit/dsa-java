import java.util.Scanner;

public class Basic_Billing_System {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("------->Welcome to Eleven Store<-------");
        System.out.println("Enter the Product ID to Add Item to Your Cart");
        System.out.println("---->Product Details<----");
        int key = 1199;
        int mou = 499;
        int st = 450;
        int us=300;
        int ps=90000;
        System.out.println("101: Keyboard (Rs " + key + ")");
        System.out.println("102: Mouse (Rs " + mou + ")");
        System.out.println("103: Stand (Rs " + st + ")");
        System.out.println("104: USB-C (Rs" + us + ")");
        System.out.println("105: PS-5 (Rs" + ps + ")");
        System.out.println("106: MacBook");
        System.out.println("107: Mobile Phone");

    }

}