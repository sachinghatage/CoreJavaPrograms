package stringPrograms;

public class SwapVowels {
    public static void main(String[] args) {
        String s="sachin";
        String swapVowels = swapVowels(s);
        System.out.println(swapVowels);
    }

    private static String swapVowels(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (isVowel(chars[i]) && isVowel(chars[j])){
                    char temp=chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                    i++;
                    j--;
            } else if (isVowel(chars[i])) {
                j--;
            }else {
                i++;
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
         c = Character.toLowerCase(c);
         return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
