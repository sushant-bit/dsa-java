import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from the user till user does not press S or s
        while(true) {
//            Take the operator as input
            char s = in.next().trim().charAt(0);
            if(s == '+' || s == '-' || s=='*'|| s=='/' || s=='%'){
                //input two numnber
                int num1= in.nextInt();
                int num2 = in.nextInt();
                
            }
        }
    }
}
