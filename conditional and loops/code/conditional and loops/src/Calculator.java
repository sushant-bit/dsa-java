import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from the user till user does not press S or s
        int ans =0;
        while(true) {
//            Take the operator as input
            System.out.print("Enter the operator: ");
            char s = in.next().trim().charAt(0);
            if(s == '+' || s == '-' || s=='*'|| s=='/' || s=='%'){
                //input two numnber
                System.out.print("Enter two numbers:");
                int num1= in.nextInt();
                int num2 = in.nextInt();

                if(s=='+'){
                    ans=num1+num2;
                }

                if(s=='-'){
                    ans=num1-num2;
                }

                if(s=='*'){
                    ans=num1*num2;
                }

                if(s=='/'){
                    if (num2!=0){
                    ans=num1/num2;}
                    else {
                        System.out.println("Error: num2 cannot be zero");
                    }
                }

                if(s=='%'){
                    ans=num1%num2;
                }


            } else if (s == 'x' || s=='X') {
                break;
            }
            else {
                System.out.println("Invalid Operation!!!!!!!");
            }

            System.out.println(ans);
        }

    }
}
