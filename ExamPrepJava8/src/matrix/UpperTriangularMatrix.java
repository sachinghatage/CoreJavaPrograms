package matrix;

public class UpperTriangularMatrix {
    public static void main(String[] args) {


        int[][] a = {{1, 2, 3, 4}, {4, 5, 6, 6}, {7, 8, 9, 9}, {2, 3, 4, 5}};
        int row = a.length;
        int column = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(a[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}