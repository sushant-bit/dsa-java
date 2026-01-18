import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        if(ans==true){
            System.out.println("Oho balle balle ye toh prime hai!!!");
        }
        else {
            System.out.println("Ooopssss.....! Not a PrimeNumber");
        }
    }

    static boolean isPrime (int n){
    if(n<=1){
        return false;
    }
    int c =2;
    while(c*c<=n){
        if(n%c==0){
            return false;
        }
        c++;

    }
        return c * c > n;
    }
}
