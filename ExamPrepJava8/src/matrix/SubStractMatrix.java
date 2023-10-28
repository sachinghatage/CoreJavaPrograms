package matrix;

public class SubStractMatrix {
    public static void main(String[] args) {
        int[][] a={{11,12,13},{14,15,16},{17,18,19}};
        int[][] b={{6,2,3},{4,5,6},{7,8,9}};
        int[][] diff=new int[a.length][b.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                diff[i][j]=a[i][j]-b[i][j];
            }
        }

        for (int i=0;i< diff.length;i++) {
            for (int j = 0; j < diff.length; j++) {
                System.out.println(diff[i][j]);
            }
        }

    }
}
