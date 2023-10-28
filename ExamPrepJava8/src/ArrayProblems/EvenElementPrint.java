package ArrayProblems;

public class EvenElementPrint {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        for (int i=0;i<a.length;i=i+2){       //i=0 for odd and i=1 for even
            System.out.print(a[i]);
        }
    }
}
