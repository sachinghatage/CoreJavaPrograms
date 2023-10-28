package ArrayProblems;

public class LargestElement {
    public static void main(String[] args) {
        int[] a={28,34,43,23,23,56,23};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
