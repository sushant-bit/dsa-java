import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
      String nama=greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print how many time greeting: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i +" = " +nama);
        }
    }

    static String greet(){
        String greeting="Namaste K cha";
        return greeting;
    }
}
