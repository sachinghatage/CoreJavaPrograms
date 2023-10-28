public class Main {
    public static void main(String[] args) {

        String s="sachin";
        int vowels = findVowels(s);
        System.out.println(vowels);
    }

    private static int findVowels(String s) {
        int count=0;
         for(int i=0;i<=s.length()-1;i++){
             char c = s.charAt(i);
             if(c=='a' || c== 'e' || c=='i'|| c=='o' || c=='u'){
                 count++;
             }
         }
            return count;
    }
}