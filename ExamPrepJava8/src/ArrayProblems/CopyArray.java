package ArrayProblems;

public class CopyArray {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2=new int[a1.length];
        for (int i=0;i<a1.length;i++){
            a2[i]=a1[i];
        }
        for (int i=0;i<a2.length;i++){
            System.out.println(a2[i]);
        }
    }
}
