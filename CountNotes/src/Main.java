import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rs5Note = 5;
        int rs1Note = 1;

        Scanner scan = new Scanner(System.in);
        int productCost = scan.nextInt();

        int remainder1 = productCost % rs5Note;
        int remainder2 = rs1Note - remainder1;
        if (remainder2 != 0 || remainder2 != 1) {
            System.out.println("-1");
        }
    }
}