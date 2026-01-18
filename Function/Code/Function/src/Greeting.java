import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//greeting();
        Scanner sc =new Scanner(System.in);
        System.out.println("Daalo apna naam aur paao respect: ");
        String naam = sc.next();
        String susu= Mygreet(naam);
        System.out.println(susu);
    }
    static String Mygreet(String name){
        String Pranam="Pranam "+name;
        return Pranam;

    }

    static void greeting(String greet){
        System.out.println("Namaste");
    }

    }
