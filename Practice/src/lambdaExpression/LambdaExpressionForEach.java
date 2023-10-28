package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionForEach {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("sachin","aman","karan");
        //lambda expression
        names.forEach(name-> System.out.println(name));

        //method reference
        names.forEach(System.out::println);

    }
}
