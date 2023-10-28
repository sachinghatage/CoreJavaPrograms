package palindrome;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121;
        palindrome(n);
    }

    public static void palindrome(int n){
        int reverse=0;
        int temp=n;
        while(n>0){
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println("palindrome number");
        }else{
            System.out.println("not palindrome number");
        }
    }
}
