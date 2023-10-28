package stringPrograms;

public class CountCharacters {
    static int count=0;
    public static void main(String[] args) {
        String s="this is java program";
        int count = countChar(s);
        System.out.println(count);
    }

    private static int countChar(String s) {
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
