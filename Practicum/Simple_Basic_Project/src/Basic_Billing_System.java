import java.util.Scanner;

public class Basic_Billing_System {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("------->Welcome to Eleven Store<-------");
        System.out.println("Enter the Product ID to Add Item to Your Cart");
        System.out.println("---->Product Details<----");
        int total_bill=0;
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
        System.out.println("106: MacBook List");
        System.out.println("107: Mobile Phone List");
        System.out.println("Please Enter Your Name: ");
        String name = sc.nextLine();
        boolean shopping=true;
        while (shopping){
            System.out.println("Enter Product ID of Item You Want to Buy. Press 0 to Finish Buying");
            int product_id= sc.nextInt();
            if (product_id==101){
                total_bill+=key;
                System.out.println("Added Keyboard to Your Cart.");
            } else if (product_id==102) {
                total_bill+=mou;
                System.out.println("Added Mouse to Your Cart.");
            } else if (product_id==103) {
                total_bill+=st;
                System.out.println("Added Laptop Stand to Your Cart.");
            }else if (product_id==104) {
                total_bill+=us;
                System.out.println("Added USB-C to Your Cart.");
            }
            else if (product_id==105) {
                total_bill+=ps;
                System.out.println("Added PS-5 to Your Cart.");
            }else if (product_id==106) {
                total_bill+=macbook(sc);
            }else if (product_id==107) {
                total_bill+=mobile(sc);
            }else if(product_id==0){
                shopping=false;
            }
            else {
                System.out.println("Invalid Product ID!");
            }
        }
        System.out.println("Name: "+name + "\nBill Amount: Rs. "+ total_bill+ "\n-----Thank You For Visiting Eleven Store :)-----");



    }

    static int mobile(Scanner sc){
        int mobile_total_price=0;
        boolean shopping=true;
        while(shopping){
            System.out.println("Select a Phone");
            System.out.println("1: Samsung Galaxy S25 Ultra (12/256GB) - Rs. 184999");
            System.out.println("2: Samsung Galaxy A36 5G (8/256GB) - Rs. 54999");
            System.out.println("3: Apple iPhone 17 (512GB) - Rs. 197999");
            System.out.println("4: Xiaomi 15 Ultra (16/512GB) - Rs. 149999");
            System.out.println("5: OnePlus 12 (16/512GB) - Rs. 139999");
            System.out.println("6: Vivo V50 5G (12/256GB) - Rs. 67999");
            System.out.println("7: Realme C67 5G (6/128GB) - Rs. 21999");
            System.out.println("8: Redmi Note 14 5G (8/256GB) - Rs. 29999");
            System.out.println("9: OnePlus Nord CE3 (12/256GB) - Rs. 38499");
            System.out.println("0: Finish adding phones");
            System.out.print("Enter choice: ");
            int choice= sc.nextInt();

            if(choice == 1){
                System.out.println(" Added Samsung Galaxy S25 Ultra to Your cart");
                mobile_total_price += 184999;
            }
            else if(choice == 2){
                System.out.println(" Added Samsung Galaxy A36 5G to Your cart");
                mobile_total_price += 54999;
            }
            else if(choice == 3){
                System.out.println(" Added Apple iPhone 17 to Your cart");
                mobile_total_price += 197999;
            }
            else if(choice == 4){
                System.out.println(" Added Xiaomi 15 Ultra to Your cart");
                mobile_total_price += 149999;
            }
            else if(choice == 5){
                System.out.println(" Added OnePlus 12 to Your cart");
                mobile_total_price += 139999;
            }
            else if(choice == 6){
                System.out.println(" Added Vivo V50 5G to Your cart");
                mobile_total_price += 67999;
            }
            else if(choice == 7){
                System.out.println(" Added Realme C67 5G to Your cart");
                mobile_total_price += 21999;
            }
            else if(choice == 8){
                System.out.println(" Added Redmi Note 14 5G to Your cart");
                mobile_total_price += 29999;
            }
            else if(choice == 9){
                System.out.println(" Added OnePlus Nord CE3 to Your cart");
                mobile_total_price += 38499;
            }
            else if (choice == 0) {
                shopping = false;
            }
            else{
                System.out.println("Invalid output");
            }
        }
        return mobile_total_price;

    }
    static int macbook(Scanner sc) {
        int macbook_total_price = 0;
        boolean shopping = true;

        while (shopping) {
            System.out.println("Select a MacBook");
            System.out.println("1: MacBook Air M2 (8/256GB) - Rs. 159999");
            System.out.println("2: MacBook Air M2 (16/512GB) - Rs. 199999");
            System.out.println("3: MacBook Pro 14-inch (16/512GB) - Rs. 249999");
            System.out.println("4: MacBook Pro 16-inch (32/1TB) - Rs. 399999");
            System.out.println("0: Finish adding MacBooks");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println(" Added MacBook Air M2 (8/256GB) to Your cart");
                macbook_total_price += 159999;
            }
            else if (choice == 2) {
                System.out.println(" Added MacBook Air M2 (16/512GB) to Your cart");
                macbook_total_price += 199999;
            }
            else if (choice == 3) {
                System.out.println(" Added MacBook Pro 14-inch (16/512GB) to Your cart");
                macbook_total_price += 249999;
            }
            else if (choice == 4) {
                System.out.println(" Added MacBook Pro 16-inch (32/1TB) to Your cart");
                macbook_total_price += 399999;
            }
            else if (choice == 0) {
                shopping = false;
            }
            else {
                System.out.println("Invalid output");
            }
        }

        return macbook_total_price;
    }


}