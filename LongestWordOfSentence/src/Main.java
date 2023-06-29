public class Main {
    public static void main(String[] args) {

   String s="this is the java world";
        String[] s1 = s.split(" ");
        String longestWord="";

        for(String s2:s1){
            if(s2.length()>longestWord.length()){
                longestWord=s2;
            }
        }

        System.out.println(longestWord);

    }
}