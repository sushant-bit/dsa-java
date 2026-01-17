import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruits name: ");
        String fruits= in.next();

        switch (fruits) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}