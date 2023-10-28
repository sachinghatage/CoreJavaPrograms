public class Main {

    //replacing all the white spaces
    public static void main(String[] args) {

        String s="this is java";
        String replace = s.replaceAll("\\s", "");
        System.out.println(replace);
        System.out.println(replace.length());

    }
}