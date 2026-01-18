public class Shadowing {
    static int a=10;//this will be shadow at line 6
    public static void main(String[] args) {
        System.out.println(a);//10
        int a; // the class variable at line 2 is shadow by this
//        System.out.println(a); scope will begin when value is initialized
        a=23;//
        System.out.println(a);//23
        func();
    }

    static void func(){
        System.out.println(a);
    }
}
