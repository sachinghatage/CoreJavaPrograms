package reverseString;

public class ReverseStringWhileloop {
    public static void main(String[] args) {
        String s="sachin";
        reverse(s);
    }

    public static void reverse(String s){
        int i=s.length()-1;

        while(i>=0){
            System.out.print(s.charAt(i));
            i--;
        }

    }
}
