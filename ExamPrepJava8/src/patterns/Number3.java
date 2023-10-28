package patterns;

public class Number3 {
//            1
//            2 4
//            3 6 9
//            4 8 12 16

    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
