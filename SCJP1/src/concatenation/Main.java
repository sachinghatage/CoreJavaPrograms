package concatenation;

public class Main {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("123");
    String s1="123";
    sb.append("abc");
     s1=s1.concat("abc");

        System.out.println(sb+"   "+s1);

    }
}