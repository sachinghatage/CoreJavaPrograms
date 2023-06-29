public class Main {
    public static void main(String[] args) {
        int a=545;
        boolean b = palindromeNumber(a);
        System.out.println(b);

    }

    private static boolean palindromeNumber(int a) {
        int palindrome=a;
        int reverse=0;
        while(palindrome!=0){
            int remainder=palindrome%10;
             reverse=reverse*10+remainder;
             palindrome=palindrome/10;
        }
        if(a==reverse)
            return true;

        return false;
    }

}