public class Main {
    public static void main(String[] args) {

        String s="level";
        boolean isPalindrome=true;

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}