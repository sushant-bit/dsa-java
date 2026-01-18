import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("Enter first number :");
        n1=in.nextInt();
        System.out.print("Enter second number :");
        n2=in.nextInt();
        sum=n1+n2;
        System.out.println("Sum = " +sum);
    }


}
