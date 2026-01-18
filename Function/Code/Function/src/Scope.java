public class Scope {
    public static void main(String[] args) {
int a=122;
int s=1221;
        {
//            int a=11; already initialized outside block in the same method hence you cannot initialized again but you change the value
            a =22; //here reassign the original ref variable to some other value
            int c =34;// value initialized in this block, will remain in block
            System.out.println(c);

        }
        System.out.println(a);
    }
}
