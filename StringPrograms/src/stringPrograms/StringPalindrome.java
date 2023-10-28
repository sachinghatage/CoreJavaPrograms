package stringPrograms;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="mom";
        System.out.println(isPalindrome(s));
    }

    public static  boolean isPalindrome(String s){

//        for(int i=0;i<s.length()-1;i++){
//            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                return false;
//            }
//        }

        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
            if (s.equals(rev)){
                return true;
            }

        }

        return false;
    }
}
