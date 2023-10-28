package stringPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="keep";
        String s2="peek";
        isAnagram(s1,s2);
    }

    private static void isAnagram(String s1,String s2) {
        if(s1.length()!=s2.length())
            System.out.println("Both are not anagram");
        else{
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1,c2)){
                System.out.println("Both are anagram");
            }
        }


    }
}
