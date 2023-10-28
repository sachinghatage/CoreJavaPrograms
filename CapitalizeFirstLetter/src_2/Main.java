public class Main {
    public static void main(String[] args) {

        String s="this is java world";
        String[] s1 = s.split(" ");
//
//        StringBuilder stringBuilder=new StringBuilder();
//        for(String s2:s1){
//            char toUpperCase = Character.toUpperCase(s2.charAt(0));
//            String s3 = toUpperCase + s2.substring(1);
//            stringBuilder.append(s3).append(" ");
//        }
//
//        System.out.println(stringBuilder.toString().trim());

//        for(String s2:s1){
//           // char c = Character.toUpperCase(s2.charAt(0));
//            char c = s2.charAt(0);
//            char i =(char) (c - 32);
//
//            String s3 = i + s2.substring(1);
//            System.out.print(s3+" ");
//        }


        for (String s2 : s1) {
            char c = s2.charAt(0);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            String s3 = c + s2.substring(1);
            System.out.print(s3 + " ");
        }
    }
}