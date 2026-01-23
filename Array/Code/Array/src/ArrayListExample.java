import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        long sushant_phone=9812178081L;

        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Long> list = new ArrayList<>(5);
//        list.add(56);
//        list.add(256);
//        list.add(256);
//        list.add(23256);
//        list.add(5632);
//        list.add(5623);
////        System.out.println(list.contains(562));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(4);
//        System.out.println(list);
        
        
        //input

        for (int i = 0; i < 5; i++) {
        list.add(in.nextLong());
        }

        if (list.contains(sushant_phone)){
            System.out.println("Here is the phone number of sushant: "+ sushant_phone);
        }

        //output
        System.out.println(list);


    }
}
