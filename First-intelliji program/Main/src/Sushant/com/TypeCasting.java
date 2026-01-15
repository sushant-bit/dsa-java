package Sushant.com;

public class TypeCasting {
    public static void main(String[] args) {
        // type casting
        // floats lai chai integers maa converter garne
        // Type Casting
        //Compressing the bigger number in a smaller type explicitly
        int num = (int) (64.88f);
        System.out.println(num);

        //automatic type promotion in expressions

//        int a = 257;
//        byte b= (byte) (a); //257%256=1
//        System.out.println(b);

//        byte a =40;
//        byte b =50;
//        byte c =100;
//        int d=(a * b)/c;
//        System.out.println(d);


     byte b = 42;
     char c ='S';
     short s = 1024;
     int i= 24000;
     float f = 6.67f;
     double d=6.34532345;
     double result = (f*b)+(i/c)-(d*s);
     // float + int - double= double
        //float ra byte maa float is bigger teivayer float value aayo
        //integer ra character maa integer is bigger teivayer integer value aayo
        //double ra shor maa double is bigger teivayer double value aayo
        //overall float, integer and double aayo so tyo madya bigger value vaneko double ko huncha so final answer is in double.
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);



    }
}
