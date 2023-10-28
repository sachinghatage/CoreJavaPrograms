package palindrome;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "mada";
        boolean b = palindrome(s);
        System.out.println(b);
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
}