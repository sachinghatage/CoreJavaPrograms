package stringjoiner;
import java.util.*;
public class Program1 {


    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",","#","#");
        stringJoiner.add("I");
        stringJoiner.add("am");
        stringJoiner.add("java");
        stringJoiner.add("Developer");
        System.out.println(stringJoiner);

    }


}
