package matrix;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] a={{1,1,1},{2,2,2},{3,3,3}};
        int[][] b={{1,1,1},{2,2,2},{3,3,3}};
        int[][] multiply=new int[a.length][b.length];
        int i,j=0;
        for (i=0;i<a.length;i++){
            for (j=0;j<b.length;j++){
                multiply[i][j]=0;
                for (int k=0;k<3;k++){
                    multiply[i][j]+=a[i][k]*b[k][j];
                }

            }

        }
        System.out.println(multiply[j][i]);



    }
}
