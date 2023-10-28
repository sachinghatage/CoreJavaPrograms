package reverseString;

public class ForLoop {
    public static void main(String[] args) {
        String s="sachin";
        String reverse = reverse(s);
        System.out.print(reverse);
    }

    public static String reverse(String s){
        char[] c=new char[s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--){

             c[j++]=s.charAt(i);
        }
        return new String(c);
    }
}
