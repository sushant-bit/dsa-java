import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mdarr= new ArrayList<>();
        //initialization
        for (int i = 0; i < 3; i++) {
            mdarr.add( new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mdarr.get(i).add(in.nextInt());
            }
        }

        System.out.println(mdarr);
    }
}
