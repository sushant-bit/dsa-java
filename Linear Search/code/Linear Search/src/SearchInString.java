public class SearchInString {
    public static void main(String[] args) {
        String name = "Sushant";
        char target='u';
        System.out.println(name.length());
        System.out.println(search(name, target));
    }

    static boolean search(String str, char tar){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (tar==str.charAt(i));
            return true;
        }

        return false;
    }
}
