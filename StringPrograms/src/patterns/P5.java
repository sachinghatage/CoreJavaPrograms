package patterns;

public class P5 {
//         *
//        * *
//       * * *
//      * * * *
//       * * *
//        * *
//         *


    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<2*n;i++){
            int i1 = (i > n) ? 2 * n - i : i;
            int spaces=n-i1;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int j=0;j<i1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
