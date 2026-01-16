import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Frist Number: ");
        int a= input.nextInt();
        System.out.println("Enter a Second Number: ");
        int b= input.nextInt();
        System.out.println("Enter a Third Number: ");
        int c= input.nextInt();

        // find the largest of the three numbers

//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

        int max = Math.max(c,Math.max(a,b));

        System.out.println("Greatest among three is: "+max);
    }
}
