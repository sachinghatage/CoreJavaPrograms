package lineup;

public class LineUp {
    public static void main(String[] args) {
        double d=12.345;
        System.out.printf("|%7.3f|\n",d);
    }
}


//        %: This is the start of the format specifier.
//        7: It specifies the total width of the printed output, including both the integer part and the fractional part.
//        .3: It specifies the number of decimal places to be displayed.
//        f: It indicates that the argument to be formatted is a floating-point number.