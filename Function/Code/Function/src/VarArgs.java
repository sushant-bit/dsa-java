import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//    func("Sushant","Sabita","Prashanna","Pratik","Isha");
mixy(1,2,"SUSHANT");
    }


    static void mixy(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void func(String ...s){
        System.out.println(Arrays.toString(s));
    }
}
