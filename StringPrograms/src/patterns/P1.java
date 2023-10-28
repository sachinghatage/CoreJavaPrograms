package patterns;

public class P1 {
//          1
//        2   2
//     3    3    3

    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            //printing spaces
            for (int j=1;j<=3-i;j++){
                System.out.print(" ");
            }

            //printing numbers
            for (int k=1;k<=i;k++){
                System.out.print(i+" "); //if i is replaced with k then     //  1
            }                                                              //1    2
            System.out.println();                                       //1    2     3
        }
    }
}
