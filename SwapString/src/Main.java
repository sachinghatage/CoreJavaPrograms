public class Main {
    public static void main(String[] args) {

        String s1="Antra";
        String s2="India";
         s1=s1+s2;
         s2=s1.substring(0,s1.length()-s2.length());
         s1=s1.substring(s2.length());

        System.out.println("s1 is "+ s1);
        System.out.println("s2 is "+ s2);

    }
}