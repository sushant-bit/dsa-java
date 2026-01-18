import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        boolean ans = armstr(n);
//        System.out.println(ans);
//        if(ans==true){
//            System.out.println("Oho balle balle ye toh prime hai!!!");
//        }
//        else {
//            System.out.println("Ooopssss.....! Not a PrimeNumber");
//        }

        for (int i = 100; i <1000 ; i++) {
            if (armstr(i)){
                System.out.println(i+ " = Armstrong Number ");
            }
        }
    }


    static boolean armstr(int n){
        int ori=n;
        int sum=0;

        while(n>0){
        int rem =n%10;
        n=n/10;
        sum= sum+rem*rem*rem;

        }

        return sum == ori;
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
