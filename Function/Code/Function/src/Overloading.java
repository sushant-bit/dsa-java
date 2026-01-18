import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//fun(23);
//fun("Sushant");

//        fun(1,2,34,3); it will print code line 11 function because the argument is in integer
//        fun("Sushant","Adhikari"); // it will print line 12 function because the argument is in string
//        fun(); this type of error call Ambiguous
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }


    static void fun(int num){
        System.out.println(num);

    }

    static void fun(String name){
        System.out.println(name);
    }
}
