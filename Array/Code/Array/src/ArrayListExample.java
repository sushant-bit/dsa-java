import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(56);
        list.add(256);
        list.add(256);
        list.add(23256);
        list.add(5632);
        list.add(5623);
        System.out.println(list.contains(562));
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);


    }
}
