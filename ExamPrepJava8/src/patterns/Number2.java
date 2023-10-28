package patterns;

public class Number2 {
//            *000*000*
//            0*00*00*0
//            00*0*0*00
//            000***000

    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=4;i++){
            for (j=1;j<=4;j++){
                if (j==5 || i==j){
                    System.out.print("* ");
                }else {
                    System.out.print("0 ");
                }
            }
            j--;
            System.out.print("* ");
            while(j>=1){
                if (i==j){
                    System.out.print("* ");
                }else {
                    System.out.print("0 ");

                }
                j--;
            }
            System.out.println("");
        }
    }
}
