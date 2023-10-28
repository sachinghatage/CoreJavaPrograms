package patterns;

public class Number4 {
//    1     1
//     2   2
//      3 3
//       4
//      3 3
//     2   2
//    1     1

    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=8;i++){
            for (j=1;j<=4;j++) {
                if (i == j)
                    System.out.print(j);

                else if (i > 4 && j == 8 - i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
    }
}
