package QDemo;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
       // scan.nextLine();


        Double d= scan.nextDouble();
        scan.nextLine();
        String s= scan.nextLine();



        System.out.println(n);
        System.out.println(d);
        System.out.println(s);

    }
}
//    The reason for calling scan.nextLine() twice after scan.nextInt() is related to how the Scanner class
//       handles newline characters.
//
//        When you use scan.nextInt(), it reads an integer value but leaves the newline character (\n) in
//        the input stream. This newline character is not consumed by nextInt(). So, when you subsequently
//        call scan.nextLine() to read the string input (s), it reads the leftover newline character as an
//        empty string ("\n").
//
//        To address this, you can call scan.nextLine() an additional time after scan.nextInt() to consume
//        the newline character. The first scan.nextLine() call consumes the remaining input after reading
//        the integer, including the newline character. The second scan.nextLine() call then reads the
//        actual string input entered by the user.