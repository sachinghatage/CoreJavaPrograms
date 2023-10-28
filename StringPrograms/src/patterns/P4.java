package patterns;

public class P4 {
//    *
//    * *
//    * * *
//    * *
//    *
public static void main(String[] args) {
    int n=3;
    for (int i=0;i<2*n;i++){
        int i1 = (i > n) ? 2 * n - i : i;        //columns condition is n-(row-n+1)
        for (int j=0;j<i1;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

}
