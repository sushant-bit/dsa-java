import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//       int ans =sum2();
//        System.out.println(ans);
        int ans =sum3(20,30,60);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()

    static int sum3(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
// return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("Enter first number :");
        n1=in.nextInt();
        System.out.print("Enter second number :");
        n2=in.nextInt();
        sum=n1+n2;
        return sum;
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
