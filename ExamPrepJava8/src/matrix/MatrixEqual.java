package matrix;

public class MatrixEqual {
    public static void main(String[] args) {
        boolean flag=true;
        int[][] a={{1,6,3},{4,5,6},{7,8,9}};
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};

        if (a.length!=b.length && a[0].length!=b[0].length)
            flag=false;

        else {
            for (int i=0;i<a.length;i++){
                for (int j=0;j<b.length;j++){
                    if (a[i][j]!=b[i][j])
                        flag=false;
                }
            }
        }
        if (flag)
            System.out.println("matrix are equal");
        else if (!flag) {
            System.out.println("matrix are not equal");
        }

    }
}
