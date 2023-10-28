package stringPrograms;

public class LongestString {
    public static void main(String[] args) {
        String s=" hi i'm learning java";
        String[] split = s.split(" ");
        String longWord="";
        for (String word:split){
            if(word.length()>longWord.length()){
                longWord=word;
            }
        }
        System.out.println(longWord);
    }
}
