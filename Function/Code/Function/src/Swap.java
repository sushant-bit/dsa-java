public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        //swap number code
//        int temp=a;
//        a=b;
//        b=temp;
//        swap(2,3);
        String name = "Sushant";
        naaam(name);

    }

    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;  // this change will only valid in this function scope only
        System.out.println(a+" = a "+b+" = b");
    }

    static void naaam(String naaamu){
        String naamu="Jiru";
        System.out.println(naaamu);
    }


}
