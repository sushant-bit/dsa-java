public class Main {
    public static void main(String[] args) {
        //syntax
        //datatype[] variableName= new datatype[size];
        // Store 5 roll numbers
//       int[] roll= new int[5];
//        System.out.println(roll);
//       // or directly you can write
//        int[] rols={1,23,23,23,44};
//        // store a person name

        int[] roll; //declaration on an array. roll is getting define in the stack
        roll = new int[5]; // initialization actually here object is being created in the memory/heap memory
        System.out.println(roll[4]);

    }
}