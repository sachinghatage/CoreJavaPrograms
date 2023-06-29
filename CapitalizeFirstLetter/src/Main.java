public class Main {
    public static void main(String[] args) {

        String s="this is java world";
        String[] s1 = s.split(" ");

        StringBuilder stringBuilder=new StringBuilder();
        for(String s2:s1){
            char toUpperCase = Character.toUpperCase(s2.charAt(0));
            String s3 = toUpperCase + s2.substring(1);
            stringBuilder.append(s3).append(" ");
        }

        System.out.println(stringBuilder.toString().trim());
    }
}