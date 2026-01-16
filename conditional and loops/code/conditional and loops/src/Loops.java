import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
//        for (int i=1;i<=num;i++){
//            System.out.println(i);
//        }
        int n=1;

        while(n<=num){
            System.out.println(n);
            n++;
        }
    }
}
